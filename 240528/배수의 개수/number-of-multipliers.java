import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int count3=0, count5=0;
        int[] num=new int[10];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<10;i++){
            num[i]=scan.nextInt();
        }

        for(int x:num){
            if(x%3==0){
                count3++;
            }
            if(x%5==0){
                count5++;
            }
        }

        System.out.printf("%d %d",count3,count5);
    }
}