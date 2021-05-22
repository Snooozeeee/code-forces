import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KthNotDivisibleByN {
    public static void kthNotDivisibleByN()throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(reader.readLine());
        int i;
        long n,k,q,r,num;
        long[] answer=new long[t];
        for(i=0;i<t;i++){
            String[] n_k=reader.readLine().split(" " );
            n=Long.parseLong(n_k[0]);
            k=Long.parseLong(n_k[1]);
            if(n>k){
                answer[i]=k;
            }
            else {
                q=k/(n-1);
                r=k%(n-1);
                if(r!=0){
                    num=q*n+r;
                    while (num%n==0){
                        num++;
                    }
                    answer[i]=num;
                }
                else {
                    answer[i]=q*n-1;
                }
            }
        }
        for(i=0;i<t;i++){
            System.out.println(answer[i]);
        }
    }
}
