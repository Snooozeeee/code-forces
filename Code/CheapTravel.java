import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheapTravel {
    public static void cheapTravel() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n, m, a, b;
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        a = Integer.parseInt(input[2]);
        b = Integer.parseInt(input[3]);
        int sum1 = (n / m) * b + (n % m) * a;
        int sum2 = ((n / m) + 1) * b;
        int sum3 = n * a;
        System.out.println(Math.min(Math.min(sum1, sum2), sum3));
    }
}

