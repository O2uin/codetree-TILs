import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        char c='A';

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(c);
                c++;
                if(c>'Z') c='A';
            }
            System.out.println();
        }
    }
}