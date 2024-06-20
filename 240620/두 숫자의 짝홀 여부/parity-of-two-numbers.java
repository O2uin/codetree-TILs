import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        if(a%2==0){
            System.out.println("even");
        }else if(a%2!=0){
            System.out.println("odd");
        }

        if(b%2==0){
            System.out.println("even");
        }else if(b%2!=0){
            System.out.println("odd");
        }
    }
}