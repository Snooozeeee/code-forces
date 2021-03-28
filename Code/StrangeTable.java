import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrangeTable {
    public static void strangeTable()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(reader.readLine());
        int i;
        long n,m,x;
        long r_num;
        long c_num;
        long[] output=new long[t];
        for(i=0;i<t;i++){
            String[] input=reader.readLine().split(" ");
            n=Long.parseLong(input[0]);
            m=Long.parseLong(input[1]);
            x=Long.parseLong(input[2]);
            if(n==1||m==1){
                output[i]=x;
                continue;
            }
            r_num=x%n==0?n:x%n;
            c_num=x<=n?1:((x-r_num)/n)+1;
            output[i]=c_num+m*(r_num-1);
        }
        for(i=0;i<t;i++){
            System.out.println(output[i]);
        }
    }
}
