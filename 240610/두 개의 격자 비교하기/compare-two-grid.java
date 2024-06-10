import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[][] num=new int[n][m];
        int[][] num2=new int[n][m];
        int count=0;

        while(count<2){
            for(int i=0;i<n;i++){
                for(int j=0; j<m;j++){
                    if(count==0) num[i][j]=scan.nextInt();
                    else num2[i][j]=scan.nextInt();
                }
            }count++;
        }

        for(int k=0;k<n;k++){
            for(int l=0;l<m;l++){
                if(num[k][l]==num2[k][l]){
                    System.out.printf("0 ");
                }else{
                    System.out.printf("1 ");
                }
            }
            System.out.println();
        }


    }
}