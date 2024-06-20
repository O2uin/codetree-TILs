import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        if(a<b){
            System.out.print("1 ");
        }else if(a>b){
            System.out.print("0 ");
        }

        if(a==b){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}