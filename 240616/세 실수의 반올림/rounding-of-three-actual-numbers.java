import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        double[] num=new double[3];
        for(int i=0;i<3;i++){
            num[i]=scan.nextDouble();
            System.out.printf("%.3f",num[i]);
            System.out.println();
        }
    }
}