import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a, b,sum=0;
        a=scan.nextInt();
        b=scan.nextInt();

        for(int i=a;i<=b;i++){
            sum+=i;
        }

        System.out.println(sum);
    }
}