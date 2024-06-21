import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a<10 || a>20){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}