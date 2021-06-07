import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumAbsurdity {
    public static void maximumAbsurdity()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int n,k,i,j;

        String[] n_k=reader.readLine().split(" ");

        n=Integer.parseInt(n_k[0]);
        k=Integer.parseInt(n_k[1]);

        String[] input=reader.readLine().split(" ");

        long[] law=new long[n+1];
        long[][] dp=new long[3][n+1];
        int[][] pos=new int[3][n+1];

//        long[] absurd=new long[n+1];
        for(i=1;i<=n;i++){
            law[i]=Long.parseLong(input[i-1]);
        }

        for(i=1;i<=n;i++){
            law[i]+=law[i-1];
        }

        for(i=1;i<=2;i++){
            for(j=i*k;j<=n;j++){
                if(dp[i][j-1]>=(dp[i-1][j-k]+law[j]-law[j-k])){
                    pos[i][j]=pos[i][j-1];
                    dp[i][j]=dp[i][j-1];
                }
                else {
                    pos[i][j]=j;
                    dp[i][j]=dp[i-1][j-k]+law[j]-law[j-k];
                }
            }
        }

//        for(i=0;i<3;i++){
//            for(j=0;j<=n;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        for(i=0;i<3;i++){
//            for(j=0;j<=n;j++){
//                System.out.print(pos[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for(i=0;i<n-k+1;i++){
//            System.out.println(absurd[i]);
//        }
        int a=pos[1][pos[2][n]-k]-k,b=pos[2][n]-k;

        System.out.println((a+1)+" "+(b+1));
    }
}
