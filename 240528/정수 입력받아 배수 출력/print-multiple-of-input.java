import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=n, j=2; i<=n*5; i=n*j,j++){
            System.out.printf("%d ",i);
        }
    }
}