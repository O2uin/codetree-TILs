import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=n;i>0;i--){
            for(int k=0;k<n-i;k++){
                System.out.print("  ");
            }
            for(int j=i;j>0;j--){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}