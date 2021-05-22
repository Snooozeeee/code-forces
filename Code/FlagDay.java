import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlagDay {
    public static void flagDay()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] n_m=reader.readLine().split(" ");
        int n,m,i,j,c=0;
        n=Integer.parseInt(n_m[0]);
        m=Integer.parseInt(n_m[1]);
        int[] color=new int[n+1];
        boolean flag;
        for(i=0;i<m;i++){
            flag=false;
            String[] dance=reader.readLine().split(" ");
            for(j=0;j<3;j++){
                if(color[Integer.parseInt(dance[j])]!=0){
                    flag=true;
                    c=color[Integer.parseInt(dance[j])];
                    break;
                }
            }
            if(flag){
                int k=c;
                for(j=0;j<3;j++){
                    if(color[Integer.parseInt(dance[j])]!=c){
                        color[Integer.parseInt(dance[j])]=++k%3==0?3:k%3;
                    }
                }
            }
            else {
                for(j=0;j<3;j++){
                    color[Integer.parseInt(dance[j])]=j+1;
                }
            }
        }
        for(i=1;i<=n;i++){
            System.out.print(color[i]+" ");
        }
    }
}
