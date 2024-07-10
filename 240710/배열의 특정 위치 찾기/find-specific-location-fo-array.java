import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int sum=0;
        int avg=0;
        int count=0;

        for(int i=0;i<10;i++){
            num[i]=scan.nextInt();
            if(i%2!=0){
                sum+=num[i];
            }

            if((i+1)%3==0){
                avg+=num[i];
                count++;
            }
        }

        System.out.printf("%d %.1f",sum,(double)avg/count);
    }
}