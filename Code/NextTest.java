import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NextTest {
    public static void nextTest()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        String input[]=reader.readLine().split(" ");
        long[] arr=new long[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=Long.parseLong(input[i]);
        }
        Arrays.sort(arr);
        for(i=0;i<n;i++){
            if(arr[i]!=i+1){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(n+1);
    }
}
