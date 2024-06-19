import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        a+=87;
        b%=10;
        System.out.printf("%d\r\n%d",a,b);
    }
}