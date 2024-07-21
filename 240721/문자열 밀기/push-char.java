import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        str=str.substring(1)+str.charAt(0);
        System.out.println(str);
    }
}