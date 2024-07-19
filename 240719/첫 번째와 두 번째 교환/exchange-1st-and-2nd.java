import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        char one=str.charAt(0);
        char two=str.charAt(1);
        char[] charArray = str.toCharArray();

        for(int i=0;i<str.length();i++){
            if(one==str.charAt(i)){
                charArray[i]=two;
            }else if(two==str.charAt(i)){
                charArray[i]=one;
            }
        }
        for(char i:charArray)
            System.out.print(i);
    }
}