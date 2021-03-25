import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class KuriyamaMiraiStones{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void answerToQuestions()throws IOException{
        FastReader fr=new FastReader();
        int n=fr.nextInt();
        ArrayList<Long> list=new ArrayList<>();
        int i;
        for(i=0;i<n;i++){
            list.add(fr.nextLong());
        }
        long sum_arr[]=new long[n];
        sum_arr[0]=list.get(0);
        for(i=1;i<n;i++){
            sum_arr[i]+=(sum_arr[i-1]+list.get(i));
        }
        Collections.sort(list);
        long sum_sort_arr[]=new long[n];
        sum_sort_arr[0]=list.get(0);
        for(i=1;i<n;i++){
            sum_sort_arr[i]+=(sum_sort_arr[i-1]+list.get(i));
        }
        int m=fr.nextInt();
        long answers[]=new long[m];
        int t,l,r;
        for(i=0;i<m;i++){
            String task[]=fr.nextLine().split(" ");
            t=Integer.parseInt(task[0]);
            l=Integer.parseInt(task[1]);
            r=Integer.parseInt(task[2]);
            if(t==1){
                if(l==1){
                    answers[i]=sum_arr[r-1];
                }
                else if(l==r){
                    answers[i]=l==1?sum_arr[l-1]:sum_arr[l-1]-sum_arr[l-2];
                }
                else {
                    answers[i]=sum_arr[r-1]-sum_arr[l-2];
                }
            }
            else {
                if(l==1){
                    answers[i]=sum_sort_arr[r-1];
                }
                else if(l==r){
                    answers[i]=l==1?sum_sort_arr[l-1]:sum_sort_arr[l-1]-sum_sort_arr[l-2];
                }
                else {
                    answers[i]=sum_sort_arr[r-1]-sum_sort_arr[l-2];
                }
            }
        }
        for(i=0;i<m;i++){
            System.out.println(answers[i]);
        }
    }
}