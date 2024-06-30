import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        for(int i=1;i<=9;i++){
            for(int j=b;j>=a;j--){
                if(j%2==0){
                    System.out.printf("%d * %d = %d ",j,i,j*i);
                    if(j==a) break;
                    System.out.print("/ ");
                }
                
            }
            System.out.println();
        }
    }
}