import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //공백 코드가 0 1 2 3 4 식으로 늘어남
        //별 코드는 5 3 1 식으로 줄어듦
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            //줄 수
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            //2(n-i)
            for(int k=0;k<2*(n-i)-1;k++){
                //5 4 3 2 1 
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}