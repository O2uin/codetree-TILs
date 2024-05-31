import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int result=n;
        int count=0;

        for(int i=1;i<=n;i++){
            result/=i;
            count++;
            if(result<=1){
                System.out.println(count);
                break;
            }
            
        }
    }
}