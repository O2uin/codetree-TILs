import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        char st[]=new char[10];

        for(int i=0;i<10;i++){
            st[i]=scan.next().charAt(0);
        }

        System.out.printf("%s %s %s",st[1],st[4],st[7]);
    }
}