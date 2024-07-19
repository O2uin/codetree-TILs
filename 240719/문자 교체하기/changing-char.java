import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str1=scan.next();
        String str2=scan.next();

        str2=str1.substring(0,2)+str2.substring(2);
        System.out.println(str2);
    }
}