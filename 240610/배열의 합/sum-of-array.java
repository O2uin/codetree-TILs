import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int sum=0;

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int a=scan.nextInt();
                sum+=a;
                
            }
            System.out.println(sum);
            sum=0;
        }
    }
}