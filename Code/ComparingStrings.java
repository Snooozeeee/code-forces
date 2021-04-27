import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComparingStrings {
    public static void genome()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input1=reader.readLine();
        String input2=reader.readLine();
        if(input1.length()!=input2.length()){
            System.out.println("NO");
            return;
        }
        char char_input1=' ';
        char char_input2=' ';
        boolean flag=false;
        int i;
        int cnt=0;
        for(i=0;i<input1.length();i++) {
            if (input1.charAt(i) != input2.charAt(i) && !flag) {
                char_input1 = input1.charAt(i);
                char_input2 = input2.charAt(i);
                i++;
                break;
            }
        }
        if(i==input1.length()){
            System.out.println("NO");
            return;
        }
        for(;i<input1.length();i++){
            if(input1.charAt(i)!=input2.charAt(i)){
                if(char_input1==input2.charAt(i)&&char_input2==input1.charAt(i)){
                    flag=true;
                    i++;
                    break;
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        for(;i<input1.length();i++){
            if(input1.charAt(i)!=input2.charAt(i)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println(flag?"YES":"NO");
    }
    public static void genome2()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input1=reader.readLine();
        String input2=reader.readLine();
         if(input1.length()!=input2.length()){
             System.out.println("NO");
             return;
         }
        char char_input1=' ';
        char char_input2=' ';
        boolean flag=false;
        int num=0;
        for(int i=0;i<input1.length();i++){
            if(input1.charAt(i)!=input2.charAt(i)&&num==0){
                char_input1=input1.charAt(i);
                char_input2=input2.charAt(i);
                num++;
            }
            else if(input1.charAt(i)!=input2.charAt(i)&&num==1){
                if(input1.charAt(i)==char_input2&&input2.charAt(i)==char_input1){
                    num++;
                    flag=true;
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
            else if(input1.charAt(i)!=input2.charAt(i)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println(flag?"YES":"NO");
    }
}
