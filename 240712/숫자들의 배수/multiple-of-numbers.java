import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=n;
        int mul=1;
        int count=0;

        while(true){
            n=a*mul;
            System.out.printf("%d ",n);
            mul++;
            if(n%5==0){
                count++;
            }
            if(count==2){
                break;
            }
        }
    }
}