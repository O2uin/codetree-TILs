import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        boolean ee=false;
        boolean ab=false;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)=='e'&&str.charAt(i)=='e'){
                ee=true;
            }
            if(str.charAt(i-1)=='a'&&str.charAt(i)=='b'){
                ab=true;
            }
        }

        if(ee) System.out.printf("Yes ");
        else System.out.printf("No ");

        if(ab) System.out.print("Yes");
        else System.out.print("No");
    }
}