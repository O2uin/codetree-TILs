import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();

        

        if(a==5 || a%2==0){
            if(a==5){
                System.out.println("A");
            }
            if(a%2==0){
                System.out.println("B");
            }
        }
    }
}