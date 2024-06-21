import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int a=scan.nextInt();

        if(s==0){
            if(a<20){
                //미자남
                System.out.println("BOY");
            }else{
                //성인남
                System.out.println("MAN");
            }
        }else{
            if(a<20){
                //미자여
                System.out.println("GIRL");
            }else{
                //성인여
                System.out.println("WOMAN");
            }
        }
    }
}