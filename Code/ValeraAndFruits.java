import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValeraAndFruits {

    public static void valeraAndFruits()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] n_v=reader.readLine().split(" ");
        int n,v,a;
        long b,rem=0,cnt=0;
        n=Integer.parseInt(n_v[0]);
        v=Integer.parseInt(n_v[1]);
        int i;
        long[] fruits=new long[3002];

        for(i=0;i<n;i++){
            String[] a_b=reader.readLine().split(" ");
            a=Integer.parseInt(a_b[0]);
            b=Long.parseLong(a_b[1]);
            fruits[a]+=b;
        }

        for(i=1;i<=3001;i++){
            if(fruits[i]==0){
                cnt+=v>rem?rem:v;
                rem=0;
            }
            else {
                if(rem==0){
                    if(fruits[i]<=v){
                        cnt+=fruits[i];
                        rem=0;
                    }
                    else {
                        cnt+=v;
                        rem=fruits[i]-v;
                    }
                }
                else {
                    if(v>=fruits[i]+rem){
                        cnt+=(fruits[i]+rem);
                        rem=0;
                    }
                    else {
                        cnt+=v;
                        if(rem>=v){
                            rem=fruits[i];
                        }
                        else {
                            rem=fruits[i]-(v-rem);
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
