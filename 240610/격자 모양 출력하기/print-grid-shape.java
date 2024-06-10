import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[][] num=new int[n][n];

        for(int i=0;i<m;i++){
            int a=scan.nextInt();
            int b=scan.nextInt();

            num[a-1][b-1]=a*b;
        }

        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                System.out.printf("%d ",num[j][k]);
            }
            System.out.println();
        }
    }
}