import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlippingGame {
    public static void max1s()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(reader.readLine());
        String[] input=reader.readLine().split(" ");
        int cnt1=0;
        int cnt0=0;
        int max_cnt0=-1;
        int i=0;
        while(i<n){
            if(input[i].equals("1")){
                cnt1++;
                if(cnt0>0){
                    cnt0--;
                }
            }
            else {
                cnt0++;
                if(cnt0>max_cnt0){
                    max_cnt0=cnt0;
                }
            }
            i++;
        }
        System.out.println(cnt1+max_cnt0);
    }
}
