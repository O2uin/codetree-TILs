import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int num=scan.nextInt();
            if(num==m) count++;
        }
        System.out.println(count);
    }
}