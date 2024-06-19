import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n>79){
            System.out.println("pass");
        }else{
            int a=80-n;
            System.out.printf("%d more score",a);
        }
    }
}