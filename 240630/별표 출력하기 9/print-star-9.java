import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
                
            }
            for(int l=1;l<i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}