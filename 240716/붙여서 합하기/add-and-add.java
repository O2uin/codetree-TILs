import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        String ab=String.valueOf(a)+String.valueOf(b);
        String ba=String.valueOf(b)+String.valueOf(a);

        System.out.println(Integer.parseInt(ab)+Integer.parseInt(ba));
    }
}