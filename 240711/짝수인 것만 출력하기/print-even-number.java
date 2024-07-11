import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int num=0;
        for(int i=0;i<n;i++){
            num=scan.nextInt();
            if(num%2==0){
                System.out.print(num+" ");
            }
        }
    }
}