import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sail {
    public static void wind()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input[]=reader.readLine().split(" ");
        long t=Long.parseLong(input[0]);
        long s_x=Long.parseLong(input[1]);
        long s_y=Long.parseLong(input[2]);
        long e_x=Long.parseLong(input[3]);
        long e_y=Long.parseLong(input[4]);
        String direction=reader.readLine();
        char d_x,d_y;
        int m_x,m_y;
        boolean flag=false;
        if(e_x>s_x){
            d_x='E';
            m_x=1;
        }
        else {
            d_x='W';
            m_x=-1;
        }
        if(e_y>s_y){
            d_y='N';
            m_y=1;
        }
        else {
            d_y='S';
            m_y=-1;
        }
        int tt=0;
        while (tt<t){
            if(direction.charAt(tt)==d_x&&e_x!=s_x){
                s_x+=m_x;
            }
            if(direction.charAt(tt)==d_y&&e_y!=s_y){
                s_y+=m_y;
            }
            if(e_x==s_x&&e_y==s_y){
                flag=true;
                break;
            }
            tt++;
        }
        if(flag){
            System.out.println(tt+1);
        }
        else {
            System.out.println(-1);
        }
    }
}
