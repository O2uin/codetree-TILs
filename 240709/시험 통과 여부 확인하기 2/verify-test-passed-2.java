import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int num=0;
        int avg=0;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                //
                num=scan.nextInt();
                sum+=num;
            }
            avg=sum/4;
            if(avg>=60){
                System.out.println("pass");
                count++;
            }else System.out.println("fail");
            avg=0;
            sum=0;
        }

        System.out.println(count);
    }
}