import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FixedPoints {
    public static void fixedPoints()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int i,n=Integer.parseInt(reader.readLine());
        int[] arr=new int[n];
        String[] input=reader.readLine().split(" ");
        for(i=0;i<n;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
        int cnt=0;
        boolean swap=false;
        boolean fixedPoint=true;
        for(i=0;i<n;i++){
            if(arr[i]==i){
                cnt++;
            }
            else {
                if(arr[arr[i]]==i&&!swap) {
                    swap = true;
                }
                fixedPoint=false;
            }
        }
        if(fixedPoint){
            System.out.println(cnt);
        }
        else {
            if(swap) {
                System.out.println(cnt+2);
            }
            else {
                System.out.println(cnt+1);
            }
        }
    }
}
