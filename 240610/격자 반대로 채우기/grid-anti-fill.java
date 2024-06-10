import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] num=new int[n][n];
        int count=n*n;
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=n-1;j>=0;j--){
                    num[j][i]=count;
                    count--;
                }
            }else{
                for(int j=0;j<n;j++){
                    num[j][i]=count;
                    count--;
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