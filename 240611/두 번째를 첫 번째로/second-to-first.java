import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char a=str.charAt(0);
        char b=str.charAt(1);
        System.out.println(str.replace(b, a));
    }
}