import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String a=String.valueOf(n);
        int sum=0;

        for(int i=0;i<a.length();i++){
            sum+=a.charAt(i)-'0';
        }
        System.out.println(sum);
        
    }
}