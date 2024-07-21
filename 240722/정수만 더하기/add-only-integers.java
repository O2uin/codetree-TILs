import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int sum=0;
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a>='0'&&a<='9'){
                int b=(int)(a-'0');
                sum+=b;
            }
        }
        System.out.println(sum);
    }
}