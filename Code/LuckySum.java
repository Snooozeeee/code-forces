import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckySum {
    public static void luckySum() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int l = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        long[] luckyNum=getLucky();
        long sum=getLuckySum(luckyNum,r)-getLuckySum(luckyNum,l-1);
        System.out.println(sum);
    }
    private static long[] getLucky()throws IOException{
        long[] arr=new long[2001];
        arr[1]=4;
        arr[2]=7;
        int i;
        int t=1;
        for(i=3;i<=2000;){
            arr[i++]=arr[t]*10+4;
            arr[i++]=arr[t++]*10+7;
        }
        return arr;
    }
    private static long getLuckySum(long[] luckyArr,long n){
        long ans=0;
        for(int i=1;i<=2000;i++){
            if(n>luckyArr[i]){
                ans+=luckyArr[i]*(luckyArr[i]-luckyArr[i-1]);
            }
            else {
                ans+=luckyArr[i]*(n-luckyArr[i-1]);
                break;
            }
        }
        return ans;
    }
}
