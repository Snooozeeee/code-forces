import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoadConstruction {
    public static void roadConstruction()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] n_m=reader.readLine().split(" ");
        int n=Integer.parseInt(n_m[0]);
        int m=Integer.parseInt(n_m[1]);
        boolean[] link=new boolean[n];
        int i;
        for(i=0;i<m;i++){
            String[] pairs=reader.readLine().split(" ");
            link[Integer.parseInt(pairs[0])-1]=true;
            link[Integer.parseInt(pairs[1])-1]=true;
        }
        int linkCity=0;
        for(i=0;i<n;i++){
            if(!link[i]){
                linkCity=i;
                break;
            }
        }
        System.out.println(n-1);
        for(i=0;i<n;i++){
            if(i==linkCity){
                continue;
            }
            System.out.println((linkCity+1)+" "+(i+1));
        }
    }
}
