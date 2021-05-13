import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SerejaAndBottles {
    public static void closedBottle()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        long[] a=new long[n];
        long[] b=new long[n];
        boolean[] open_Bottles=new boolean[n];
        int bottles=n;
        int i,j,index;
        for(i=0;i<n;i++){
            String[] input=reader.readLine().split(" ");
            a[i]=Long.parseLong(input[0]);
            b[i]=Long.parseLong(input[1]);
        }
        for(i=0;i<n;i++) {
            for (j = 0; j < n; j++) {
                if (b[i] == a[j] && i!=j) {
                    if (open_Bottles[j] == false) {
                        open_Bottles[j] = true;
                        bottles--;
                    }
                }
            }
        }
        System.out.println(bottles);
    }
}
