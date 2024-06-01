import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String num=scan.next();
        String[] ch = num.split("-");

        System.out.printf("010-%s-%s",ch[2],ch[1]);
    }
}