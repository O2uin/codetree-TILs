import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.printf("%d ",j+1);
            }
            System.out.println();
        }
    }
}