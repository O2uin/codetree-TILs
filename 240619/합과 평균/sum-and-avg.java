import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int sum=a+b;
        double avg=(double)sum/2;
        System.out.printf("%d %.1f",sum, avg);
    }
}