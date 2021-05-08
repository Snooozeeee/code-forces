import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HungrySequence {
    public static void hungry()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        int i,j;
        boolean flag;
        int num=0;
        if(n<100) {
            for (i = 2; num < n; i++) {
                flag = false;
                for (j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.print(i + " ");
                    num++;
                }
            }
        }
        else {
            while (num<n){
                System.out.print((n+num)+" ");
                num++;
            }
        }
    }
}
