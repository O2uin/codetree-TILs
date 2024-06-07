import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=0; i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.printf("%d * %d = %d",i+1, j,(i+1)*j);
                if(j!=n-i){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}