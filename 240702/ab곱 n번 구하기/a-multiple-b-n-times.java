import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int a=scan.nextInt();
            int b=scan.nextInt();
            int result=1;
            for(int j=a;j<=b;j++){
                result*=j;
            }
            System.out.println(result);
        }
    }
}