import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int sum=a+b+c;
        int avg=sum/3;
        System.out.printf("%d\r\n%d",sum,avg);
    }
}