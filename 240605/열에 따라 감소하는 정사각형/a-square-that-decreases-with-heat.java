import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();

        for(int j=0;j<n;j++){
            for(int i=n;i>0;i--){
                System.out.printf("%d ", i);
            }
            System.out.println();
        }    
    }
}