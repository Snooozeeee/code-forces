import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KitaharaGift {
    public static void apples()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        String input[]=reader.readLine().split(" ");
        int count[]=new int[2];
        long sum=0;
        for(int i=0;i<n;i++){
            if(input[i].equals("100")){
                sum+=100;
                count[0]++;
            }
            else {
                sum+=200;
                count[1]++;
            }
        }
        if(n%2!=0&&(count[0]==0||count[1]==0)){
            System.out.println("NO");
            return;
        }
        System.out.println(sum%200==0&&n!=1?"YES":"NO");
    }
}
