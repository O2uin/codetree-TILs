import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        char b=scan.next().charAt(0);
        int count=0;

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b){
                count++;
            }
        }

        System.out.println(count);
    }
}