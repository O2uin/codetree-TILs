import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a>='a'&&a<='z' || a>='1'&&a<='9'){
                System.out.print(a);
            }else if(a>='A'&&a<='Z'){
                System.out.print((char)(a+32));
            }
        }
    }
}