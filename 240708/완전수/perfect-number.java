import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int st=scan.nextInt();
        int en=scan.nextInt();
        int a=0;
        int count=0;

        for(int i=st;i<=en;i++){
            for(int j=1;j<i;j++){
                if(i%j==0){
                    a+=j;
                }
            }
            if(i==a){
                count++;
            }
            a=0;
        }
        System.out.println(count);
    }
}