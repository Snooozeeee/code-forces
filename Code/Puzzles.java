import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Puzzles {
    public static void lastGift()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input[]=reader.readLine().split(" ");
        int n=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);
        int puzzle[]=new int[m];
        String input_puzzle[]=reader.readLine().split(" ");
        for(int i=0;i<m;i++){
            puzzle[i]=Integer.parseInt(input_puzzle[i]);
        }
        Arrays.sort(puzzle);
        int best=Integer.MAX_VALUE;
        for(int i=0;i<=m-n;i++){
            best=Math.min(best,puzzle[i+n-1]-puzzle[i]);
        }
        System.out.println(best);
    }
}
