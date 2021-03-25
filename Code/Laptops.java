import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Laptops {
    public static void alexReviews()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        if(n==1){
            System.out.println("Poor Alex");
            return;
        }
        ArrayList<Laptop> sortByQuality=new ArrayList<>();
        ArrayList<Laptop> sortByPrice=new ArrayList<>();
        int i;
        for(i=0;i<n;i++){
            String[] input=reader.readLine().split(" ");
            sortByPrice.add(new Laptop(Integer.parseInt(input[0]),Integer.parseInt(input[1])));
            sortByQuality.add(new Laptop(Integer.parseInt(input[0]),Integer.parseInt(input[1])));
        }
        sortByPrice.sort(new sortPrice());
        sortByQuality.sort(new sortQuality());
        i=n-1;
        while (i>=0){
            if(sortByQuality.get(i)==sortByPrice.get(i)){
                i--;
                continue;
            }
            if(sortByPrice.get(i).price>sortByQuality.get(i).price&&sortByPrice.get(i).quality<sortByQuality.get(i).quality){
                System.out.println("Happy Alex");
                return;
            }
            i--;
        }
        System.out.println("Poor Alex");
    }
}
class Laptop{
    int price,quality;
    public Laptop(int price,int quality){
        this.price=price;
        this.quality=quality;
    }
    public String toString(){
        return this.price+" "+this.quality;
    }
}
class sortQuality implements Comparator<Laptop>{
    public int compare(Laptop a,Laptop b){
        return a.quality-b.quality;
    }
}
class sortPrice implements Comparator<Laptop>{
    public int compare(Laptop a,Laptop b){
        return a.price-b.price;
    }
}
