import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan =new Scanner(System.in);
        int count=0;
        int n=scan.nextInt();
        int line=0;

        //9부터 1까지 반복, n줄 출력
        for(int i=0;i<n;i++){
            for(int j=9;j>0;j--){
                System.out.print(j);
                count++;
                if(count==n){
                    count=0;
                    System.out.println();
                    line++;
                }
                if(line==n){
                    System.exit(0);
                }
            }
        }
    }
}