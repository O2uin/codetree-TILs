import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //a,b 입력받고 
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int i=a;

        while(i<=b){
            System.out.printf("%d ",i);
            if(i%2==0){
                //3더하기 짝수
                i+=3;
            }else{
                i*=2;
            }
        }
    }
}