import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=0;i<n;i++){
            //i+1 만큼 별찍기
            for(int x=0;x<i+1;x++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
        for(int j=n-1;j>0;j--){
            for(int y=0;y<j;y++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}