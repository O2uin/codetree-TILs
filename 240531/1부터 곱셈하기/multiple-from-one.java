import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int mul=1;

        for(int i=1;i<=10;i++){
            mul*=i;
            if(mul>=n){
                System.out.println(i);
                break;
            }
        }
    }
}