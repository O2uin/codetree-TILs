import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int one=1;

        while(one<=n){
            if(one%3==0){
                System.out.printf("%d ",one);
            }
            one++;
        }
    }
}