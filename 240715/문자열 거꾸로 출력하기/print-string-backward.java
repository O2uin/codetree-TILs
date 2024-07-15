import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        while(true){
            String a=scan.nextLine();
            if(a.equals("END")) break;
            for(int i=a.length()-1;i>=0;i--){
                System.out.printf("%c",a.charAt(i));
            }
            System.out.println();
        }
    }
}