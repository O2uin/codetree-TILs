import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(count);
                count++;
                if(count==10) count=1;
            }
            System.out.println();
        }
    }
}