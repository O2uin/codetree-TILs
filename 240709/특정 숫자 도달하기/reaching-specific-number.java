import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int sum=0;
        int count=0;

        for(int i=0;i<10;i++){
            num[i]=scan.nextInt();
        }

        for(int j=0;j<10;j++){
            if(num[j]>=250){
                break;
            }
            sum+=num[j];
            count++;
        }
        
        System.out.printf("%d %.1f", sum, (double)sum/count);

    }
}