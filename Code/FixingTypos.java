import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FixingTypos {
    public static void fixingTypos()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        int[] cntChar=new int[s.length()];
        int i,j=0;
        cntChar[j]=1;
        for(i=1;i<s.length();i++){
            if(s.charAt(j)==s.charAt(i)){
                cntChar[j]++;
            }
            else {
                j=i;
                cntChar[i]++;
            }
        }
        for(i=0;i<s.length();i++){
            if(cntChar[i]>2){
                cntChar[i]=2;
            }
        }
        for(i=0;i<s.length()-1;i++){
            if(cntChar[i]==2){
                for(i=i+1;i<s.length();i++){
                    if(cntChar[i]==1){
                        break;
                    }
                    if(cntChar[i]>=2){
                        cntChar[i]=1;
                        break;
                    }
                }
            }
        }
        for(i=0;i<s.length();i++){
            if(cntChar[i]!=0){
                while (cntChar[i]>0){
                    System.out.print(s.charAt(i));
                    cntChar[i]--;
                }
            }
        }
    }
}
