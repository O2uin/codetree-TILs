import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int min=scan.nextInt();
        int num[]=new int[n];
        num[0]=min;
        int count=0;
        for(int i=1;i<n;i++){
            num[i]=scan.nextInt();
            if(num[i]<min) min=num[i];
        }
        for(int j=0;j<n;j++){
            if(num[j]==min) count++;
        }
        

        System.out.printf("%d %d",min, count);
    }
}