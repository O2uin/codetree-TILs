import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int age1=scan.nextInt();
        String sex1=scan.next();

        int age2=scan.nextInt();
        String sex2=scan.next();
        
        if((age1>18&&sex1.equals("M")) || (age2>18&&sex2.equals("M"))){
            System.out.println("1");
            
        }else{
            System.out.println("0");
        }

    }
}