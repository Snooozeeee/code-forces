import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoxDividingCheese {

    public static void foxDividingCheese()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] a_b=reader.readLine().split(" ");
        long a=Long.parseLong(a_b[0]);
        long b=Long.parseLong(a_b[1]);
        if(a==b){
            System.out.println(0);
            return;
        }
        long gcd=0,cnt=0;
        long rem=0;
        if(a>b){
            gcd=getGCD(b,a);
        }
        else {
            gcd=getGCD(a,b);
        }
        rem=(a/gcd)*(b/gcd);
        while (rem%2==0){
            rem/=2;
            cnt++;
        }
        while (rem%3==0){
            rem/=3;
            cnt++;
        }
        while (rem%5==0){
            rem/=5;
            cnt++;
        }
        if(rem!=1){
            System.out.println(-1);
        }
        else {
            System.out.println(cnt);
        }
    }

    private static long getGCD(long a,long b){
        if(b%a==0){
            return a;
        }
        return getGCD(b%a,a);
    }
    
}
