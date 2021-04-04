import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XeniaAndDivisors {//approach
    public static void partition()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String input[] = reader.readLine().split(" ");
        int count[] = new int[8];
        for (int i = 0; i < input.length; i++) {
            count[Integer.parseInt(input[i])]++;
        }
        if(count[5]==0&&count[7]==0&&count[2]>=count[4]&&count[1]==count[4]+count[6]&&count[2]+count[3]==count[4]+count[6]){
            for(int i=0;i<count[4];i++){
                System.out.println("1 2 4");
            }
            count[2]-=count[4];
            for(int i=0;i<count[2];i++){
                System.out.println("1 2 6");
            }
            for (int i=0;i<count[3];i++){
                System.out.println("1 3 6");
            }
        }
        else {
            System.out.println(-1);
            return;
        }
    }
}
