import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        double num=(double)a/b;
        String result=String.format("%.21f",num);

        System.out.printf(result.substring(0,22));
    }
}