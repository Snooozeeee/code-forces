import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Fence {
    public static void piano()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input[] = reader.readLine().split(" ");
        int n=Integer.parseInt(input[0]);
        int k=Integer.parseInt(input[1]);
        HashSet<Integer> set=new HashSet<>();
        String height_input[] = reader.readLine().split(" ");
        int height[]=new int[n];
        int i,j;
        for(i=0;i<n;i++){
            height[i]=Integer.parseInt(height_input[i]);
            set.add(height[i]);
        }
        if(set.size()==1){
            System.out.println(1);
        }
        else if(n==k){
            System.out.println(1);
        }
        else {
            int min=0;
            int sum=0;
            for(i=0;i<k;i++){
                min+=height[i];
            }
            int prev_sum=min;
            int pos=0;
            for(i=0;i<n-k;i++){
                sum=prev_sum-height[i]+height[i+k];
                if(sum<min){
                    min=sum;
                    pos=i+1;
                }
                prev_sum=sum;
            }
            System.out.println(pos+1);
        }
    }
}
