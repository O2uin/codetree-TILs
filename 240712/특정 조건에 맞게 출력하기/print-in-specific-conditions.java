import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=0;
        while(true){
            n=scan.nextInt();
            if(n==0){
                break;
            }
            if(n%2==0){
                System.out.printf("%d ",n/2);
            }else{
                System.out.printf("%d ",n+3);
            }
        }
    }
}