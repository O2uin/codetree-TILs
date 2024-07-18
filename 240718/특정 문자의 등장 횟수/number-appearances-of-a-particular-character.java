import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int ee=0;
        int eb=0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)=='e'){
                if(str.charAt(i)=='e'){
                    ee++;
                }else if(str.charAt(i)=='b'){
                    eb++;
                }
            }
        }

        System.out.printf("%d %d",ee,eb);
    }
}