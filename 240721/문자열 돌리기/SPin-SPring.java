import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        String ori=str;
        int len=str.length()-1;
        System.out.println(str);

        while(true){
            str=str.charAt(len)+str.substring(0,len);
            System.out.println(str);
            if(ori.equals(str)) break;
        }
    }
}