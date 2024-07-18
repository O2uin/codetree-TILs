import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        int b=scan.nextInt();
        if(a.length()<b){
            for(int i=a.length()-1;i>=0;i--){
                System.out.print(a.charAt(i));
            }
        }else{
            for(int i=a.length()-1;i>=a.length()-b;i--){
                System.out.print(a.charAt(i));
            }
        }
    }
}