import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RomaAndChangingSigns {
    public static void romaAndChangingSigns()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] n_k=reader.readLine().split(" ");
        int n=Integer.parseInt(n_k[0]);
        int k=Integer.parseInt(n_k[1]);
        String[] input=reader.readLine().split(" ");
        int[] seq=new int[n];
        int i,sum=0;
        for(i=0;i<n;i++){
            seq[i]=Integer.parseInt(input[i]);
        }
        for(i=0;i<n;i++){
            if(n==1){
                if(k%2==0){
                    sum+=seq[i];
                }
                else {
                    sum-=seq[i];
                }
                continue;
            }
            if(k==0){
                sum+=seq[i];
                continue;
            }
            if(seq[i]<0){
                seq[i]*=-1;
                sum+=seq[i];
                k--;
            }
            else {
                if(k%2==0){
                    sum+=seq[i];
                }
                else {
                    if (i == 0) {
                        sum-=seq[i];
                    }
                    else
                    {
                        if (seq[i] > seq[i - 1]) {
                            sum += (seq[i] - 2 * seq[i - 1]);
                        } else {
                            sum -= seq[i];
                        }
                    }
                    k--;
                }
            }
        }
        System.out.println(sum);
    }

}
