import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();
        String num1="";
        String num2="";


        for(int i=0;i<str1.length();i++){
            char a=str1.charAt(i);
            if(!(a>=97 && a<=122 || a>=65 && a<=90)){
                num1+=String.valueOf(a);
            }
        }

        for(int j=0;j<str2.length();j++){
            char a=str2.charAt(j);
            if(!(a>=97 && a<=122 || a>=65 && a<=90)){
                num2+=String.valueOf(a);
            }
        }

        int result=Integer.parseInt(num1) + Integer.parseInt(num2);

        System.out.println(result);
    }
}