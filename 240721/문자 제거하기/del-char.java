import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        while(true){
            int a=scan.nextInt();
            if(str.length()==2){
                if(a==0) System.out.println(str.charAt(1));
                else System.out.println(str.charAt(0));
                break;
            }
            if(a>str.length()){
                str=str.substring(0,str.length());
            }else {
                str=str.substring(0,a)+str.substring(a+1);
            }
            System.out.println(str);
        }
    }
}