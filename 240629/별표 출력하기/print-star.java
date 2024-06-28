import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=1;i<2*n;i++){
            if(i<=n){
                for(int j=0;j<i;j++){//1 ~ n
                    System.out.print("* ");
                }
                System.out.println();
            }
            
            if(i>n){//n-1(i-2) ~ 1  i-n=>1 2 3...
                for(int k=2*n-i;k>0;k--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}