import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;

        while(n<=100){
            sum+=n;
            n++;
        }

        System.out.println(sum);
    }
}