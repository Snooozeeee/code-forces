import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JzzhuAndSequences {
    public static void findN()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input_x_y[]=reader.readLine().split(" ");
        long mod=1000000007;
        long x=Long.parseLong(input_x_y[0]);
        long y=Long.parseLong(input_x_y[1]);
        long z=y-x;
        long n =Long.parseLong(reader.readLine());
        long answer=0;
        long i;
        if((n+2)%3==0){
            i=(n+2)/3;
            if(i%2==0){
                answer=-1*x;
            }
            else {
                answer=x;
            }
        }
        else if((n+1)%3==0){
            i=(n+1)/3;
            if(i%2==0){
                answer=-1*y;
            }
            else {
                answer=y;
            }
        }
        else {
            i=n/3;
            if(i%2==0){
                answer=-1*z;
            }
            else {
                answer=z;
            }
        }
        System.out.println(Math.floorMod(answer,mod));
    }
}
