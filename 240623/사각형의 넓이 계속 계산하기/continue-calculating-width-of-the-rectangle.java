import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        while(true){
            int a=scan.nextInt();
            int b=scan.nextInt();
            char c=scan.next().charAt(0);

            System.out.println(a*b);
            if(c=='C') break;
        }
    }
}