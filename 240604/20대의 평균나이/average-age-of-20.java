import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int sum=0;
        int cnt=0;

        Scanner scan=new Scanner(System.in);
        
        while(true){
            int n=scan.nextInt();
            if(n>=30||n<20){
                break;
            }
            sum+=n;
            cnt++;
        }
        double avg=(double)sum/cnt;

        System.out.printf("%.2f",avg);
        
    }
}