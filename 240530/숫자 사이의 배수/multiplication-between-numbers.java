import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int sum=0;//합
        int num=0;//합한 개수

        for(int i=a;i<=b;i++){
            if(i%5==0 || i%7==0){
                sum+=i;
                num++;
            }
        }
        double avg=(double)sum/num;
        System.out.printf("%d %.1f",sum,avg);
    }
}