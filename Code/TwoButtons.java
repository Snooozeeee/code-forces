import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoButtons {
    public static void twoButtons()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int i;
        int pos;
        int cnt = 0;
        while (m != n) {
            if (m < n) {
                cnt += (n - m);
                break;
            }
            if (m % 2 == 0) {
                m /= 2;
            } else {
                m++;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
