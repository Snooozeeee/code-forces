import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterestingDrinks {

    public static void veryInterestingDrinks()throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int i,j,cnt,n=Integer.parseInt(reader.readLine());
        String[] input=reader.readLine().split(" ");
        int[] shops=new int[100001];
        int max=0;
        for(i=0;i<n;i++){
            j=Integer.parseInt(input[i]);
            if(j>max){
                max=j;
            }
            shops[j]++;
        }
        for(i=1;i<=100000;i++){
            shops[i]+=shops[i-1];
        }
        long m;
        int q=Integer.parseInt(reader.readLine());
        int[] answer=new int[q];
        for(i=0;i<q;i++){
            m=Long.parseLong(reader.readLine());
            if(m>=max){
                answer[i]=n;
            }
            else {
                answer[i]=shops[(int)m];
            }
        }
        for(i=0;i<q;i++){
            System.out.println(answer[i]);
        }
    }
//    public static void interestingDrinks()throws IOException{
//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        int i,j,cnt,n=Integer.parseInt(reader.readLine());
//        String[] input=reader.readLine().split(" ");
//        ArrayList<Long> shops=new ArrayList<>();
//        for(i=0;i<n;i++){
//            shops.add(Long.parseLong(input[i]));
//        }
//        long m;
//        Hashtable<Long,Integer> hashtable=new Hashtable<>();
//        for(i=0;i<shops.size();){
//            cnt=0;
//            if(hashtable.containsKey(shops.get(i))){
//                cnt=hashtable.get(shops.get(i));
//                cnt++;
//                hashtable.put(shops.get(i),cnt);
//                shops.remove(i);
//            }
//            else{
//                hashtable.put(shops.get(i),1);
//                i++;
//            }
//        }
//        Collections.sort(shops);
//        int q=Integer.parseInt(reader.readLine());
//        int num;
//        int[] answer=new int[q];
//        for(i=0;i<q;i++){
//            m=Long.parseLong(reader.readLine());
//            if(m> shops.get(shops.size()-1)){
//                answer[i]=n;
//            }
//            else if(m<shops.get(0)){
//                answer[i]=0;
//            }
//            else {
//                cnt=0;
//                for(j=0;j<shops.size();j++){
//                    if(m==shops.get(j)){
//                        answer[i]=cnt+hashtable.get(shops.get(j));
//                    }
//                    if(m<shops.get(j)){
//                        answer[i]=cnt;
//                        break;
//                    }
//                    cnt+=hashtable.get(shops.get(j));
//                }
//            }
//        }
//        for(i=0;i<q;i++){
//            System.out.println(answer[i]);
//        }
//    }
}
