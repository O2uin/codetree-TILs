import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] num=new int[n][n];
        
        for(int i=0;i<n;i++){
            if(i==0){
                for(int j=0;j<n;j++){
                    num[i][j]=1;
                }
            }else{
                num[i][0]=1;
                for(int j=1;j<n;j++){
                    num[i][j]=num[i-1][j]+num[i][j-1]+num[i-1][j-1];
                }
            }
        }

        for(int k=0;k<n;k++){
            for(int l=0;l<n;l++){
                System.out.printf("%d ",num[k][l]);
            }
            System.out.println();
        }
    }
}