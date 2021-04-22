import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMarble {
    public static void findMarble()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] input=reader.readLine().split(" ");
        String[] arrangement=reader.readLine().split(" ");
        int n,s,t,i,cnt=0;
        n=Integer.parseInt(input[0]);
        s=Integer.parseInt(input[1]);
        t=Integer.parseInt(input[2]);
        int[] arr=new int[n];
        if(s==t){
            System.out.println(0);
            return;
        }
        for(i=0;i<n;i++){
            arr[i]=Integer.parseInt(arrangement[i])-1;
        }
        int[] cntArr=new int[n];
        for(i=0;i<n;i++){
            cntArr[i]=-1;
        }
        int pos=s-1;
        for(i=0;i<n;i++){
            if(cntArr[pos]==-1){
                cntArr[pos]=cnt;
                pos=arr[pos];
                cnt++;
                if(pos==t-1){
                    System.out.println(cnt);
                    break;
                }
            }
            else {
                System.out.println(-1);
                break;
            }
        }
    }
}
