import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int count=0;

        for(int i=a;i<=b;i++){
            if(1920%i==0 && 2880%i==0){
                count++;
            }
        }

        if(count>0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}