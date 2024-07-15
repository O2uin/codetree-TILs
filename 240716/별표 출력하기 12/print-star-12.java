import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //121416 짝수에만 숫자대로 근데이제 세로로
        //앞 공백 0 1 2 2 3 3 4 4 이런식으로
        //별코드는 공백 하나씩 더하면 됨... 규칙성을 모르겠네
        //1줄 n개 2줄 n/2개 3줄부터는 좀 바뀜

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=0;i<n;i++){
            if(i==0){
                for(int j=0;j<n;j++){
                    System.out.printf("* ");
                }
            }else{
                for(int j=1;j<=n;j++){
                    if(j%2==0&&i<j){
                        System.out.printf("* ");
                    }else{
                        System.out.printf("  ");
                    }
                }
            }
            System.out.println();

        }
        
    }
}