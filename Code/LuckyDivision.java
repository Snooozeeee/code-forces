import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyDivision {
    public static void almostLucky()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        boolean[] isLucky=sieveOfLucky(n);
        int i;
        for(i=1;i<=n;i++){
            if(isLucky[i]){
                if(n%i==0){
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
    private static boolean checkLucky(int n){
        while (n>0) {
            if (n % 10 != 4 && n % 10 != 7) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }
    private static boolean[] sieveOfLucky(int n){
        boolean[] luckyArr=new boolean[n+1];
        int i,j;
        for(i=1;i<=n;i++){
            luckyArr[i]=checkLucky(i);
        }
        return luckyArr;
    }
}
