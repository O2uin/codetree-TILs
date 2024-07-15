import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int num=0;
        int lineSum[]=new int[2];
        int sum[]=new int[4];
        int sumAll=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                num=scan.nextInt();
                lineSum[i]+=num;
                sum[j]+=num;
                sumAll+=num;
            }
        }

        for(int k=0;k<2;k++){
            System.out.printf("%.1f ",(double)lineSum[k]/4);
        }System.out.println();
        for(int x=0;x<4;x++){
            System.out.printf("%.1f ",(double)sum[x]/2);
        }System.out.println();
        System.out.printf("%.1f",(double)sumAll/8);
    }
}