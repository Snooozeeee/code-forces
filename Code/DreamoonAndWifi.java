import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DreamoonAndWifi {
    
    public static void dreamoonAndWifi()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String command=reader.readLine();
        int cnt_plus=0,cnt_minus=0;
        String wifi_command=reader.readLine();
        int cnt_plus_wifi=0,cnt_minus_wifi=0,cnt_unknown=0;
        int i;
        double ans;
        for(i=0;i<command.length();i++){
            if(command.charAt(i)=='+'){
                cnt_plus++;
            }
            else {
                cnt_minus++;
            }
        }
        for(i=0;i<wifi_command.length();i++){
            if(wifi_command.charAt(i)=='+'){
                cnt_plus_wifi++;
            }
            else if(wifi_command.charAt(i)=='-'){
                cnt_minus_wifi++;
            }
            else {
                cnt_unknown++;
            }
        }
        if(cnt_minus<cnt_minus_wifi||cnt_plus<cnt_plus_wifi){
            ans=0;
        }
        else if(cnt_minus==cnt_minus_wifi&&cnt_plus==cnt_plus_wifi) {
            ans=1;
        }
        else {
            ans=((fact(cnt_unknown))/(fact(cnt_unknown-cnt_plus+cnt_plus_wifi)*fact(cnt_plus-cnt_plus_wifi)))/Math.pow(2,cnt_unknown);
        }
        String output=String.format("%1.12f",ans);
        System.out.println(output);
    }

    private static double fact(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*fact(--n);
    }
}
