import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        char a=scan.next().charAt(0);
        char b=scan.next().charAt(0);
        int min=0;
        if(a>b) min=a-b;
        else min=b-a;
        System.out.printf("%d %d",a+b,min);
    }
}