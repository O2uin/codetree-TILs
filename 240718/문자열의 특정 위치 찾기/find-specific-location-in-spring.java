import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        char a=scan.next().charAt(0);
        boolean nothing=true;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==a){
                System.out.println(i);
                nothing=false;
                break;
            }
        }

        if(nothing) System.out.println("No");
    }
}