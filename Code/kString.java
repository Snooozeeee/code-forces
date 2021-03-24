import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class kString {
    public static void makeKString()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(reader.readLine());
        String input[]=reader.readLine().split("");
        if(input.length%k!=0){
            System.out.println(-1);
            return;
        }
        if(k==1){
            for(int i=0;i<input.length;i++){
                System.out.print(input[i]);
            }
            return;
        }
        Hashtable<String,Integer> charCount=new Hashtable<>();
        Set<String> set=new HashSet<>();
        for(int i=0;i<input.length;i++){
            set.add(input[i]);
            if(charCount.containsKey(input[i])){
                int num=charCount.get(input[i])+1;
                charCount.put(input[i],num);
            }
            else {
                charCount.put(input[i],1);
            }
        }
        String newArr[]=new String[set.size()];
        set.toArray(newArr);
        String k_string="";
        for(int i=0;i<newArr.length;i++){
            if(charCount.get(newArr[i])%k!=0){
                System.out.println(-1);
                return;
            }
            int n=charCount.get(newArr[i])/k;
            while(n>=1){
                k_string+=newArr[i];
                n--;
            }
        }
        for(int i=1;i<=k;i++) {
            System.out.print(k_string);
        }
    }
}
