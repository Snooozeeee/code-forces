import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TPrimes {
    private static boolean[] sieveOfE(){
        int n=1000001;
        boolean isPrime[]=new boolean[1000001];
        int i,j;
        for(i=1;i<=1000000;i++){
            isPrime[i]=true;
        }
        for(i=2;i*i<=1000000;i++) {
            if (isPrime[i]) {
                for (j = i * i; j <= 1000000; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        isPrime[1]=false;
        return isPrime;
    }
    public static void findTPrime()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String input[] = reader.readLine().split(" ");
        int i;
        boolean isPrime[]=sieveOfE();
        long input_arr[]=new long[n];
        for(i=0;i<n;i++){
            input_arr[i]=Long.parseLong(input[i]);
        }
        int sqrt_n;
        for(i=0;i<n;i++){
            sqrt_n=(int)Math.sqrt(input_arr[i]);
            if((long)sqrt_n*sqrt_n==input_arr[i]&&isPrime[sqrt_n]){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}