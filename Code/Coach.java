import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coach {

    public static void coach()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] n_m=reader.readLine().split(" ");
        int n=Integer.parseInt(n_m[0]),m=Integer.parseInt(n_m[1]),i,j,n1,n2,n3;
        if(m==0){
            for(i=1;i<=n;i++){
                System.out.print(i+" ");
                if(i%3==0){
                    System.out.println();
                }
            }
        }
        else {
            boolean flag=false;
            int[] pair=new int[n+1];
            for(i=0;i<m;i++){
                String[] input=reader.readLine().split(" ");
                if(!flag) {
                    n1 = Integer.parseInt(input[0]);
                    n2 = Integer.parseInt(input[1]);
                    if(pair[n1]==-1){
                        flag=true;
                    }
                    else if(pair[n1]==0){
                        if(pair[n2]==0){
                            pair[n1]=n2;
                            pair[n2]=n1;
                        }
                        else if(pair[n2]==-1) {
                            flag=true;
                        }
                        else {
                            if(pair[pair[n2]]==n2){
                                if(n1>pair[n2]){
                                    pair[pair[n2]]=n1;
                                    pair[n1]=n2;
                                }
                                else {
                                    pair[n1]=pair[n2];
                                }
                                pair[n2]=-1;
                            }
                            else {
                                flag=true;
                            }
                        }
                    }
                    else {
                        if (pair[n2] == 0) {
                            if (pair[pair[n1]] == n1) {
                                if(n1<pair[n1]){
                                    if(pair[n1]<n2){
                                        pair[pair[n1]]=n2;
                                        pair[n2]=-1;
                                    }
                                    else {
                                        pair[n2]=pair[n1];
                                        pair[n1]=n2;
                                        pair[pair[n2]]=-1;
                                    }
                                }
                                else {
                                    pair[n1]=n2;
                                    pair[n2]=-1;
                                }
                            } else {
                                flag = true;
                            }
                        }
                        else if(pair[n2]==-1){
                            if(pair[n1]!=n2&&pair[pair[n1]]!=n2){
                                flag=true;
                            }
                        }
                        else {
                            flag = true;
                        }
                    }
                }
            }
//            for(i=1;i<=n;i++){
//                System.out.print(pair[i]+" ");
//            }
//            System.out.println();
            if(flag){
                System.out.println(-1);
            }
            else {
                int[] team=new int[n+1];
                boolean[] inTeam=new boolean[n+1];
                j=1;
                for(i=1;i<=n&&j<n;i++){
                    if(pair[i]!=0){
                        n1=i;
                        team[j++]=n1;
                        inTeam[n1]=true;
                        n2=pair[n1];
                        team[j++]=n2;
                        inTeam[n2]=true;
                        if(pair[n2]==n1){
                            n3=0;
                        }
                        else {
                            n3=pair[n2];
                            inTeam[n3]=true;
                        }
                        team[j++]=n3;
                        pair[n1]=0;
                        pair[n2]=0;
                        pair[n3]=0;
                    }
                }
                j=1;
                for(i=1;i<=n;i++){
                    if(team[i]==0){
                        for(;j<=n;j++){
                            if(!inTeam[j]){
                                if(pair[j]!=0){
                                    System.out.println(-1);
                                    return;
                                }
                                team[i]=j;
                                j++;
                                break;
                            }
                        }
                    }
                }
                for(i=1;i<=n;i++){
                    System.out.print(team[i]+" ");
                    if(i%3==0){
                        System.out.println();
                    }
                }
            }
        }
    }
}
