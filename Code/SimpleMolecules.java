import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SimpleMolecules {
    public static void simpleMolecules()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] a_b_c=reader.readLine().split(" ");
        long a,b,c,rem;
        long[] input=new long[3];
        long[] output=new long[3];
        int i;
        for(i=0;i<3;i++){
            input[i]=Long.parseLong(a_b_c[i]);
        }
        a=input[0];
        b=input[1];
        c=input[2];
        Arrays.sort(input);
        if(a==input[2]){
            rem=Math.abs(a-(b+c));
            if(rem%2!=0){
                System.out.println("Impossible");
                return;
            }
            else {
                output[2]=c-rem/2;
                output[1]=rem/2;
                output[0]=b-rem/2;
            }
        }
        else if(b==input[2]){
            rem=Math.abs(b-(a+c));
            if(rem%2!=0){
                System.out.println("Impossible");
                return;
            }
            else {
                output[2]=rem/2;
                output[1]=c-rem/2;
                output[0]=a-rem/2;
            }
        }
        if(c==input[2]){
            rem=Math.abs(c-(b+a));
            if(rem%2!=0){
                System.out.println("Impossible");
                return;
            }
            else {
                output[2]=a-rem/2;
                output[1]=b-rem/2;
                output[0]=rem/2;
            }
        }
        if((output[0]+output[2]==a)&&(output[0]+output[1]==b)&&(output[1]+output[2]==c)){
            System.out.println(output[0]+" "+output[1]+" "+output[2]);
        }
        else {
            System.out.println("Impossible");
        }
    }
}
