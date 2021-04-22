import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class FreeCash {
    public static void minCashes()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        String time[]=new String[n];
        int i;
        for(i=0;i<n;i++){
            time[i]=reader.readLine();
        }
        Hashtable<String,Integer> hashtable=new Hashtable<>();
        for(i=0;i<n;i++){
            if(hashtable.containsKey(time[i])){
                int m=hashtable.get(time[i]);
                m+=1;
                hashtable.put(time[i],m);
            }
            else {
                hashtable.put(time[i],1);
            }
        }
        int max=0;
        for(i=0;i<n;i++){
            if(hashtable.get(time[i])>max){
                max=hashtable.get(time[i]);
            }
        }
        System.out.println(max);
    }
}
