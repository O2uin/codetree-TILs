import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String a=scan.next();
        String b=scan.next();
        if(a.length()>b.length()){
            System.out.println(a+" "+a.length());
        }else if(a.length()<b.length()){
            System.out.println(b+" "+b.length());
        }else{
            System.out.println("same");
        }
    }
}