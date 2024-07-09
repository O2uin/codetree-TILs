import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double num=0.0;
        double sum=0.0;
        double avg=0.0;
        for(int i=0;i<n;i++){
            num=scan.nextDouble();
            sum+=num;
        }

        avg=sum/n;
        System.out.printf("%.1f\r\n",avg);

        if(avg>=4.0){
            System.out.print("Perfect");
        }else if(avg>=3.0){
            System.out.print("Good");
        }else{
            System.out.print("Poor");
        }
    }
}