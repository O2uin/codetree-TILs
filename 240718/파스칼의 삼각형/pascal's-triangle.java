import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int num[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    num[i][j]=1;
                }else{
                    num[i][j]=num[i-1][j-1]+num[i-1][j];
                }
            }
        }

        for(int x=0;x<n;x++){
            for(int y=0;y<=x;y++){
                System.out.printf("%d ",num[x][y]);
            }
            System.out.println();
        }
        
        
    }
}