import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        String b=scan.nextLine();
        String ab=a+b;
        String ba=b+a;

        if(ab.equals(ba)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}