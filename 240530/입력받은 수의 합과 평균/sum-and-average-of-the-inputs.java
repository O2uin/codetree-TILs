import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] num=new int[n];
        int sum=0;
        int count=0;

        for(int i=0;i<n;i++){
            num[i]=scan.nextInt();
        }

        for(int x:num){
            sum+=x;
            count++;
        }

        double avg=(double)sum/count;

        System.out.printf("%d %.1f", sum, avg);
        
    }
}