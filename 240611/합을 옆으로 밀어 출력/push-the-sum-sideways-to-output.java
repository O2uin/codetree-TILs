import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] num=new int[n];
        int sum=0;
        for(int i=0; i<n;i++){
            num[i]=scan.nextInt();
            sum+=num[i];
        }

        String result=String.valueOf(sum);
        result=result.substring(1)+result.substring(0,1);
        System.out.println(result);
    }
}