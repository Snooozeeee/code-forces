import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleDimaAndEquation {
    public static void littleDimaAndEquation()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] a_b_c=reader.readLine().split(" ");
        long a,b,c;
        int i;
        a=Long.parseLong(a_b_c[0]);
        b=Long.parseLong(a_b_c[1]);
        c=Long.parseLong(a_b_c[2]);
        long x;
        int cnt=0;
        long[] answer=new long[81];
        for(i=1;i<=81;i++){
            x=b*(long)Math.pow(i,a)+c;
            if(i==sumDigit(x)&&x<1000000000){
                answer[cnt++]=x;
            }
        }
        System.out.println(cnt);
        for(i=0;i<cnt;i++){
            System.out.print(answer[i]+" ");
        }
    }

    private static int sumDigit(long n){
        int sum=0;
        while (n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
