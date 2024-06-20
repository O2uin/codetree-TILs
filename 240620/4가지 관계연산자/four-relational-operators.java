import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        if(a>=b){
            System.out.println("1");
            if(a!=b){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
            System.out.println("0");
            System.out.println("0");
        }else{//a<b
            System.out.println("0");
            System.out.println("0");
            System.out.println("1");
            System.out.println("1");
        }
    }
}