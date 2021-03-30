import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSegment {
    public static void fibonacciSegment()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        String[] input=reader.readLine().split(" ");
        if(n==1||n==2){
            System.out.println(n);
            return;
        }
        int i;
        long[] a=new long[n];
        for(i=0;i<n;i++){
            a[i]=Long.parseLong(input[i]);
        }
        int segment=2;
        int maxSegment=0;
        int revSegment=2;
        for(i=2;i<n;i++){
            if(a[i-2]+a[i-1]==a[i]){
                segment++;
            }
            else {
                if(segment>maxSegment){
                    maxSegment=segment;
                }
                segment=2;
            }
        }
        segment=Math.max(maxSegment,segment);
        maxSegment=0;
        for(i=n-3;i>=2;i--){
            if(a[i+2]+a[i+1]==a[i]){
                revSegment++;
            }
            else {
                if(revSegment>maxSegment){
                    maxSegment=revSegment;
                }
                revSegment=2;
            }
        }
        revSegment=Math.max(maxSegment,revSegment);
        System.out.println(Math.max(segment,revSegment));
    }
}
