import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=11;
        int b=11;

        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%d ",a);
                a+=2;
            }
            b+=2;
            a=b;
            System.out.println();
        }
    }
}