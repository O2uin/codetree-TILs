import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int result=1;

        for(int i=1;i<=b;i++){
            if(i%a==0){
                result*=i;
            }
        }

        System.out.println(result);
    }
}