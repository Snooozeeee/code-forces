import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternatingSubsequence {

    public static void alternatingSubsequence()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n,t=Integer.parseInt(reader.readLine());
        long[] answer=new long[t];
        int i,j;
        long sum,max;
        boolean flag;
        for(i=0;i<t;i++){
            sum=0;
            n=Integer.parseInt(reader.readLine());
            long[] sequence=new long[n];
            String[] input=reader.readLine().split(" ");
            for(j=0;j<n;j++){
                sequence[j]=Long.parseLong(input[j]);
            }
            flag= sequence[0] < 0;
            for (j=0;j<n;j++){
                max=sequence[j];
                if(!flag){
                    for(;j<n;j++){
                        if(max<sequence[j]){
                            max=sequence[j];
                        }
                        if(sequence[j]<0){
                            flag=true;
                            j--;
                            break;
                        }
                    }
                }
                else {
                    for(;j<n;j++){
                        if(max<sequence[j]&&sequence[j]<0){
                            max=sequence[j];
                        }
                        if(sequence[j]>0){
                            flag=false;
                            j--;
                            break;
                        }
                    }
                }
                sum+=max;
            }
            answer[i]=sum;
        }
        for(i=0;i<t;i++){
            System.out.println(answer[i]);
        }
    }
}
