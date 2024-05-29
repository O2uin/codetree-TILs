import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        while(a<=b){
            if(a%2==0){
                System.out.printf("%d ",a);
            }
            a++;
        }
    }
}