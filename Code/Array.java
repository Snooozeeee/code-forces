import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array {
    public static void threeArrays()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        String[] input=reader.readLine().split(" ");
        int[] arr=new int[n];
        int i;
        int cnt=0;
        for(i=0;i<n;i++){
            arr[i]=Integer.parseInt(input[i]);
            if(arr[i]<0){
                cnt++;
            }
        }
        Arrays.sort(arr);
        System.out.println(1+" "+arr[0]);
        if(cnt==n-1){
            System.out.println(2+" "+arr[1]+" "+arr[2]);
            System.out.print(arr.length-3+" ");
            for(i=3;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else {
            System.out.println(1+" "+arr[n-1]);
            System.out.print(arr.length-2+" ");
            for(i=1;i<n-1;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
