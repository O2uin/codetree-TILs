import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a_m=scan.nextInt();
        int a_e=scan.nextInt();
        int b_m=scan.nextInt();
        int b_e=scan.nextInt();

        if(a_m>b_m){
            System.out.println("A");
        }else if(a_m<b_m){
            System.out.println("B");
        }else{
            if(a_e>b_e){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }
    }
}