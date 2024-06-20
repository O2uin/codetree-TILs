import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        if(a>=b){
            System.out.println("1");//1. a>=b true
            if(a!=b){
                System.out.println("1");//2. a>b true(a>=b && a!=b)
                System.out.println("0");//3. a<=b false(a>=b && a!=b)
                System.out.println("0");//4. a<b false(a>b || a==b)
                System.out.println("0");//5. a==b false(a!=b)
                System.out.println("1");//6. a!=b true
            }else{
                System.out.println("0");//2. a>b false(a==b)
                System.out.println("1");//3. a>=b true(a==b)
                System.out.println("0");//4. a<b false(a>b || a==b)
                System.out.println("1");//5.a==b true
                System.out.println("0");//6.a!=b false
            }
            
        }else{
            System.out.println("0");//1. a>=b false(a<b)
            System.out.println("0");//2. a>b false(a<b)
            System.out.println("1");//3.
            System.out.println("1");//4.
            System.out.println("0");
            System.out.println("1");
        }
        
    }
}