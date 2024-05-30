import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String c=scan.next();
        int n=scan.nextInt();
        String a="A";

        if(c.equals(a)){
            for(int i=1;i<=n;i++){
                System.out.printf("%d ",i);
            }
        }else {
            for(int i=n;i>0;i--){
                System.out.printf("%d ",i);
            }
        }

    }
}