import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int i=0;
        int[] num=new int[10];
        int sum=0;
        int count=0;
        double avg;

        while(i<10){
            num[i]=scan.nextInt();
            i++;
        }

        for(int x:num){
            if(x>=0 && x<=200){
                sum+=x;
                count++;
            }
        }

        avg=(double)sum/count;

        System.out.printf("%d %.1f",sum, avg);
    }
}