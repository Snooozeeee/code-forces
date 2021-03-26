import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicNumbers {
    public static void isMagic()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        boolean a,b,c;
        int i=0;
        while(i<input.length()){
            a=false;
            b=false;
            c=false;
            if(input.charAt(i)=='1'){
                i++;
                a=true;
                if(i==input.length()){
                    break;
                }
                if(input.charAt(i)=='4'){
                    i++;
                    b=true;
                    if(i==input.length()){
                        break;
                    }
                    if(input.charAt(i)=='4'){
                        i++;
                        c=true;
                        if(i==input.length()){
                            break;
                        }
                    }
                }
            }
            if(!(a||b||c)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
