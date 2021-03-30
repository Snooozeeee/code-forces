import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DifferenceRow {
    public static void differenceRow()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        String[] input=reader.readLine().split(" ");
        long[] a=new long[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=Long.parseLong(input[i]);
        }
        Arrays.sort(a);
            long tmp=a[0];
            a[0]=a[n-1];
            a[n-1]=tmp;

        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
