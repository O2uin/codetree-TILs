import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int first=1;
        int second=n;
        int a=0;
        System.out.printf("%d %d ",first,second);
        while(true){
            a=first+second;
            first=second;
            second=a;
            System.out.printf("%d ",a);
            if(a>100) break;
        }
    }
}