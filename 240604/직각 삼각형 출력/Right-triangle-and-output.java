import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=0 ; i<n ; i++){//1 3 5 7 9 ...
            for(int j=1 ; j<=2*i+1 ; j++){//1-0-1 | 2-1-3 | 3-2-5 | 4-3-7
            System.out.printf("*");
            }
            System.out.println();
        }
    }
}