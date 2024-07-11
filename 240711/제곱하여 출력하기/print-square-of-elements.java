import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=scan.nextInt();
            System.out.printf("%d ",num[i]*num[i]);
        }
    }
}