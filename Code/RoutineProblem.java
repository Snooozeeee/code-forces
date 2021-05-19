import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoutineProblem {
    public static void routineProblem()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] input=reader.readLine().split(" ");
        double a,b,c,d;
        a=Double.parseDouble(input[0]);
        b=Double.parseDouble(input[1]);
        c=Double.parseDouble(input[2]);
        d=Double.parseDouble(input[3]);
        double n=1;
        double num,den;
        num=Math.abs(a*d-b*c);
        den=a*d>b*c?a*d:b*c;
        n=getGCD(num,den);
        num/=n;
        den/=n;
        System.out.println((int)num+"/"+(int)den);
    }

    private static double getGCD(double a,double b){
        if(b==0){
            return a;
        }
        return getGCD(b,a%b);
    }
}
