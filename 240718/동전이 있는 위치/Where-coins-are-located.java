import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int num[][]=new int[n][n];

        for(int i=0;i<m;i++){
            //동전 위치 r,c
            int r=scan.nextInt();
            int c=scan.nextInt();
            num[r-1][c-1]=1;
        }

        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                System.out.printf("%d ",num[x][y]);
            }
            System.out.println();
        }
    }
}