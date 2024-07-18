import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int len=str.length();
        str=str.substring(0,1)+"a"+str.substring(2,len-2)+"a"+str.substring(len-1,len);
        System.out.println(str);
    }
}