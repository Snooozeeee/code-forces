import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleGirlAndGame {
    public static void winner()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        StringBuffer input_buffer=new StringBuffer(input);
        boolean first=true;
        boolean palindrome;
        int num=0;
        while(1>0){
            palindrome=true;
            int pos=0;
            for(int i=0;i<input_buffer.length()/2;i++){
                if(input_buffer.charAt(i)!=input_buffer.charAt(input_buffer.length()-i-1)){
                    palindrome=false;
                    pos=i;
                    break;
                }
            }
            if(!palindrome){
                input_buffer.deleteCharAt(pos);
                //if(pos!=0){
                //    pos--;
                //}
                System.out.println(input_buffer);
                if(first){
                    first=false;
                }
                else {
                    first=true;
                }
            }
            else {
                if(num%2==0){
                    System.out.println("First");
                }
                else {
                    System.out.println("Second");
                }
                //if(first){
                //    System.out.println("First");
                //}
                //else {
                //    System.out.println("Second");
                //}
                break;
            }
            num++;
        }
    }
    public static void winner2()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        int char_arr[]=new int[26];
        for(int i=0;i<input.length();i++){
            char_arr[input.charAt(i)-97]++;
        }
        int num_odd=0;
        for(int i=0;i<26;i++){
            if(char_arr[i]%2!=0){
                num_odd++;
            }
        }
        if(num_odd%2==0&&num_odd!=0){
            System.out.println("Second");
        }
        else {
            System.out.println("First");
        }
    }
}
