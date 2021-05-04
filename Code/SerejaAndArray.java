import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SerejaAndArray {
    public static void serejaAndArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] n_m = reader.readLine().split(" ");
        int n = Integer.parseInt(n_m[0]);
        int m = Integer.parseInt(n_m[1]);
        String[] arr_input = reader.readLine().split(" ");
        long[] arr = new long[n];
        long[] t1 = new long[n];
        long y = 0;
        int i, t;
        for (i = 0; i < n; i++) {
            arr[i] = Long.parseLong(arr_input[i]);
        }
        ArrayList<Long> answer = new ArrayList<>();
        for (i = 0; i < m; i++) {
            String[] input = reader.readLine().split(" ");
            t = Integer.parseInt(input[0]);
            if (t == 1) {
                t1[Integer.parseInt(input[1]) - 1] = y;
                arr[Integer.parseInt(input[1]) - 1] = Long.parseLong(input[2]);
            } else if (t == 2) {
                y += Long.parseLong(input[1]);
            } else {
                answer.add(arr[Integer.parseInt(input[1]) - 1] + y - t1[Integer.parseInt(input[1]) - 1]);
            }
        }
        int b=arr.length;
        for (i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }
}


