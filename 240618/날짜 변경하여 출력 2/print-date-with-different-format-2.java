import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        scan.useDelimiter("-");
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();

        System.out.printf("%d.%d.%d",z, x, y);

    }
}