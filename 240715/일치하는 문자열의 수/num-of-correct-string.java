import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String A=scan.next();
        int count=0;

        for(int i=0;i<n;i++){
            String B=scan.next();
            if(A.equals(B)){
                count++;
            }
        }

        System.out.print(count);
    }
}