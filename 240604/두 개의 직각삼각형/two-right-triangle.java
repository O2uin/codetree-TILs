import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        //n*n 직각삼각형 2개
        //2배로 하는데 공백을 어떻게 처리하면 되려나
        //하나씩 보면 정사각형에서 1개씩 줄어드는 모양
        //두개를 같이 보면 가운데가 0 2 4 6 ... 순서로 공백
        //0 1 2 3...

        for(int i=0;i<n;i++){//1
            //행
            for(int j=n-i;j>0;j--){
                //*출력1
                System.out.print("*");
            }
            for(int k=0;k<i*2;k++){
                //i*2가 공백 개수로 봐도 될듯?
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                //*출력2
                System.out.print("*");
            }
            System.out.println();
        }
    }
}