import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IlyaAndQueries {
    
    public static void ilyaAndQueries()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        int m=Integer.parseInt(reader.readLine());
        int i,l,r;
        int[] cnt=new int[s.length()];
        for(i=0;i<s.length()-1;i++){
            cnt[i+1]=s.charAt(i)==s.charAt(i+1)?1:0;
            cnt[i+1]+=i!=0?cnt[i]:0;
        }
        int[] answer=new int[m];
        for(i=0;i<m;i++){
            String[] query=reader.readLine().split(" ");
            l=Integer.parseInt(query[0]);
            r=Integer.parseInt(query[1]);
            answer[i]=cnt[r-1]-cnt[l-1];
        }
        for(i=0;i<m;i++){
            System.out.println(answer[i]);
        }
    }
}
