import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int num=0;
        int sum=0;
        for(int i=0;i<10;i++){
            num=scan.nextInt();
            sum+=num;
        }

        System.out.println(sum);
    }
}