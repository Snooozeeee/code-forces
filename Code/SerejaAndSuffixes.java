import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class SerejaAndSuffixes {
    public static void playWithArray()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input[]=reader.readLine().split(" ");
        int n=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);
        int freq[]=new int[n];
        String input_arr[]=reader.readLine().split(" ");
        int i,j;
        HashSet<String> set=new HashSet<>();
        freq[n-1]=0;
        set.add(input_arr[n-1]);
        long answers[]=new long[m];
        if(set.size()==n){
            for(i=0;i<m;i++){
                j=Integer.parseInt(reader.readLine());
                if(j>n){
                    answers[i]=-1;
                }
                else {
                    //System.out.println(freq[j-1]);
                    answers[i]=n-j+1;
                }
            }
        }
        else {
            for (i = n - 2; i >= 0; i--) {
                if (set.contains(input_arr[i])) {
                    freq[i] = 1;
                } else {
                    set.add(input_arr[i]);
                    freq[i] = 0;
                }
                freq[i] += freq[i + 1];
                //System.out.println(input_arr[i]+" "+freq[i]);
            }
            for (i = 0; i < m; i++) {
                j = Integer.parseInt(reader.readLine());
                if (j > n) {
                    answers[i] = -1;
                } else {
                    //System.out.println(freq[j-1]);
                    answers[i] = n - j + 1 - freq[j - 1];
                }
            }
        }
        for(i=0;i<m;i++){
            System.out.println(answers[i]);
        }
    }
}
