import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int b=scan.nextInt();
        int a=scan.nextInt();

        for(int i=b;i>=a;i--){
            if(i%2!=0)
                System.out.printf("%d ", i);
        }
    }
}