import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        num[0]=scan.nextInt();
        num[1]=scan.nextInt();
        for(int i=2;i<10;i++){
            num[i]=(num[i-1]+num[i-2])%10;
        }

        for(int j=0;j<10;j++){
            System.out.printf("%d ",num[j]);
        }
    }
}