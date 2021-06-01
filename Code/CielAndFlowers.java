import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CielAndFlowers {
    
    public static void cielAndFLowers()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] input=reader.readLine().split(" ");
        long r,g,b;
        r=Long.parseLong(input[0]);
        g=Long.parseLong(input[1]);
        b=Long.parseLong(input[2]);
        long b1,b2,b3,min=Math.min(r,Math.min(g,b));
        b1=r/3+g/3+b/3;
        if(min==0){
            System.out.println(b1);
        }
        else {
            b2=(r-1)/3+(g-1)/3+(b-1)/3+1;
            b3=(r-2)/3+(g-2)/3+(b-2)/3+2;
            System.out.println(Math.max(b1,Math.max(b2,b3)));
        }
    }
}
