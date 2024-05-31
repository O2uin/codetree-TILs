import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int result=0;

        if(b==0){
            result=1;
        }else{
            result=a;
            for(int i=1;i<b;i++){
                result*=a;
            }
        }

        System.out.println(result);
    }
}