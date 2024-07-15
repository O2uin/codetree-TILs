import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                char a=scan.next().charAt(0);
                System.out.printf("%c ",a-32);
            }
            System.out.println();
        }
    }
}