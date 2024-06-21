import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        boolean s=false;

        if(a>=90){
            if(b>=95){
                System.out.println("100000");
                s=true;
            }else if(b>=90){
                System.out.println("50000");
                s=true;
            }
        }

        if(!s){
            System.out.println("0");
        }
    }
}