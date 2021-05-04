import java.io.IOException;
import java.util.Scanner;

public class ChessBoard {
    public static void DZY() throws IOException {


        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        int m=s.nextInt();
        char[][] a= new char[n][m];
        String str;
        for(int i=0;i<n;i++)
        {
            str=s.next();
            for(int j=0;j<m;j++)
            {
                a[i][j]=str.charAt(j);
            }
        }
        char temp;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                temp='B';
            }
            else
            {
                temp='W';
            }
            for(int j=0;j<m;j++)
            {
                if(a[i][j]=='.')
                {
                    System.out.print(temp);

                }
                else
                {
                    System.out.print("-");
                }
                if(temp=='W')
                {
                    temp='B';
                }
                else
                {
                    temp='W';
                }
            }
            System.out.println();
        }

    }
}

