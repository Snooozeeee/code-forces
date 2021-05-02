import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DimaAndStaircase {
    public static void dimaAndStaircase()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        long[] staircase=new long[n];
        String[] height=reader.readLine().split(" ");
        int i,w;
        long h;
        for(i=0;i<n;i++){
            staircase[i]=Long.parseLong(height[i]);
        }
        int m=Integer.parseInt(reader.readLine());
        long[] answer=new long[m];
        for(i=0;i<m;i++){
            String[] input=reader.readLine().split(" ");
            w=Integer.parseInt(input[0]);
            h=Long.parseLong(input[1]);
            answer[i]=staircase[0]>staircase[w-1]?staircase[0]:staircase[w-1];
            staircase[0]=staircase[0]>=staircase[w-1]?staircase[0]+h:staircase[w-1]+h;
        }
        for(i=0;i<m;i++){
            System.out.println(answer[i]);
        }
    }
}
