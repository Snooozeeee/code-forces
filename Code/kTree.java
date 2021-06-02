import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kTree {

    public static void kTrees()throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] input=reader.readLine().split(" ");
        int n,k,d,i;
        n=Integer.parseInt(input[0]);
        k=Integer.parseInt(input[1]);
        d=Integer.parseInt(input[2]);
        long[] kTree=new long[101];
        int a,b;
        for(i=1;i<=100;i++){
            a=1;
            b=i-1;
            while (b>=0&&a<=k) {
                if (b == 0) {
                    kTree[i]++;
                } else {
                    kTree[i] += (kTree[b] % 1000000007);
                }
                b--;
                a++;
            }
        }
//        for(i=1;i<=100;i++){
//            System.out.print(kTree[i]+" ");
//        }
//        System.out.println();
        long[] kTreeD=new long[101];
        for(i=1;i<=100;i++){
            a=1;
            b=i-1;
            while (b>=0&&a<=k) {
                if(a>=d){
                    if(b==0){
                        kTreeD[i]++;
                    }
                    else {
                        kTreeD[i]+=kTree[b];
                    }
                }
                else {
                    if(b>=d){
                        kTreeD[i]+=(kTreeD[b]% 1000000007);
                    }
                }
                b--;
                a++;
            }
        }
//        for(i=1;i<=100;i++){
//            System.out.print(kTreeD[i]+" ");
//        }
        System.out.println(kTreeD[n]);
    }
}
