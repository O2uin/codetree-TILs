import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        //65~90 -32 차- 97~122
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<91){
                //대문자
                char a=(char)(str.charAt(i)+32);
                System.out.print(a);
            }else{
                //소문자
                char a=(char)(str.charAt(i)-32);
                System.out.print(a);
            }
        }
    }
}