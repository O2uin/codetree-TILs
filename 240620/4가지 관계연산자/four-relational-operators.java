import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        if(a>=b){
            System.out.println("1");//1
            if(a!=b){
                System.out.println("1");//2
                System.out.println("0");//3
            }else{//a==b
                System.out.println("0");//2
                System.out.println("1");//3
            }
            System.out.println("0");//4
        }else{//a<b
            System.out.println("0");//1
            System.out.println("0");//2
            System.out.println("1");//3
            System.out.println("1");//4
        }
    }
}