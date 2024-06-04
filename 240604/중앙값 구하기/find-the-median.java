import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        if(a<b){
            if(a>c){//b>a>c
            //a
            System.out.println(a);
            }else if(c>b){//c>b>a
            //b
            System.out.println(b);
            }else{//b>c>a
            //c
            System.out.println(c);
            }
        }else{//a>b
            if(b>c){//a>b>c
            //b
            System.out.println(b);
            }else if(a>c){//a>c>b
            //c
            System.out.println(c);
            }else{//c>a>b
                //a
                System.out.println(a);
            }
        }
    }
}