import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dubstep {
    public static void returnToClassic()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        String output[]=input.split("WUB");
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }
    }
    public static void returnToClassic2()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        int i=0;
        while (i<input.length()){
            if(i+2<=input.length()-1) {
                if (input.charAt(i) == 'W' && input.charAt(i + 1) == 'U' && input.charAt(i + 2) == 'B') {
                    System.out.print(" ");
                    i = i + 3;
                    continue;
                }
            }
                System.out.print(input.charAt(i));
                i++;

        }
    }
}
