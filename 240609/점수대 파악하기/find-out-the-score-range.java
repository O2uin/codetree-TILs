import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int[] scores=new int[10];

        for(int i=0;i<100;i++){
            int score=scan.nextInt();
            if(score==0) break;
            for(int j=1;j<=10;j++){
                if(score/10==j){
                    scores[j-1]++;
                }
            }
        }

        for(int k=10;k>0;k--){
            System.out.println(k*10+" - "+scores[k-1]);
        }
    }
}