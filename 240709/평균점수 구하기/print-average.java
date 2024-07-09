import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        double num=0;
        double sum=0;
        for(int i=0;i<8;i++){
            num=scan.nextDouble();
            sum+=num;
        }

        System.out.printf("%.1f",sum/8);
    }
}