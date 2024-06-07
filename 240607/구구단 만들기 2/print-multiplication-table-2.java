import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);

        int a=scan.nextInt();
        int b=scan.nextInt();

        for(int i=2;i<9;i+=2){
            for(int j=b;j>=a;j--){//단 수
                System.out.printf("%d * %d = %d ",j,i,j*i);
                if(j!=a){
                    System.out.print("/ ");
                }
            }
            System.out.println();
        }
    }
}