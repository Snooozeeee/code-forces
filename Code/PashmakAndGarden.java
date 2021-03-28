import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PashmakAndGarden {
    public static void findTrees()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] input=reader.readLine().split(" ");
        int x1=Integer.parseInt(input[0]);
        int y1=Integer.parseInt(input[1]);
        int x2=Integer.parseInt(input[2]);
        int y2=Integer.parseInt(input[3]);
        if(Math.abs(x2-x1)==Math.abs(y2-y1)){
            System.out.println(x1+" "+y2+" "+x2+" "+y1);
        } else if (Math.abs(y2 - y1) == 0) {
            System.out.println(x1 + " " + (y1 + Math.abs(x2 - x1)) + " " + x2 + " " + (y2 + Math.abs(x2 - x1)));
        } else if(Math.abs(x2-x1)==0){
            System.out.println((x1+Math.abs(y2-y1))+" "+y1+" "+(x2+Math.abs(y2-y1))+" "+y2);
        }
        else {
            System.out.println(-1);
        }
    }
}
