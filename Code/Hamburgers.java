import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hamburgers {
    public static void hamburgers()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String recipeInput=reader.readLine();
        String[] inputN=reader.readLine().split(" ");
        String[] inputP=reader.readLine().split(" ");
        long r=Long.parseLong(reader.readLine());
        int[] recipe=new int[3];
        int i;
        for(i=0;i<recipeInput.length();i++){
            if(recipeInput.charAt(i)=='B'){
                recipe[0]++;
            }
            else if(recipeInput.charAt(i)=='S'){
                recipe[1]++;
            }
            else {
                recipe[2]++;
            }
        }
        long[] n=new long[3];
        long[] p=new long[3];
        for(i=0;i<3;i++){
            n[i]=Long.parseLong(inputN[i]);
        }
        for(i=0;i<3;i++){
            p[i]=Long.parseLong(inputP[i]);
        }
        long price,burger,cost=0,cnt=0;
        for(i=0;i<3;i++){
            cost+=recipe[i]*p[i];
        }
        boolean flag=false;
        while (r>=0){
            long[] item=new long[3];
            for(i=0;i<3;i++) {
                if (recipe[i] != 0) {
                    if (n[i] < recipe[i]) {
                        price = (recipe[i] - n[i]) * p[i];
                        if (price > r) {
                            flag=true;
                            break;
                        }
                        r -= price;
                        n[i]=recipe[i];
                    }
                    item[i] = n[i] / recipe[i];
                }
                else {
                    item[i]=Long.MAX_VALUE;
                }
            }
            if(flag){
                break;
            }
            burger=Math.min(item[0],Math.min(item[1],item[2]));
            cnt+=burger;
            for(i=0;i<3;i++){
                if(n[i]!=0) {
                    n[i] -= burger * recipe[i];
                }
            }
            long sum=0;
            for(i=0;i<3;i++){
                if(recipe[i]!=0){
                    sum+=n[i];
                }
            }
            if(sum==0){
                break;
            }
        }
        cnt+=(r/cost);
        System.out.println(cnt);
    }
}
