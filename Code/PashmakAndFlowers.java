import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PashmakAndFlowers {
    public static void forParmida()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(reader.readLine());
        String input[]=reader.readLine().split(" ");
        long arr[]=new long[(int)n];
        for(int i=0;i<n;i++){
            arr[i]=Long.parseLong(input[i]);
        }
        long max=0;
        long num=0;
        Arrays.sort(arr);
        max=arr[arr.length-1]-arr[0];
        if(max==0){
            num=(long)(n*(n-1))/2;
            System.out.println(max+" "+num);
            return;
        }
        long min_cnt=0;
        long min_element=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]==min_element){
                min_cnt++;
            }
            else {
                break;
            }
        }
        long max_cnt=0;
        long max_element=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==max_element){
                max_cnt++;
            }
            else {
                break;
            }
        }
        num=max_cnt*min_cnt;
        System.out.println(max+" "+num);
    }
}
