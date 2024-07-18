import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //0 0
        //0 1-> 1 0
        //0 2-> 1 1 -> 2 0
        //0 3-> 1 2 -> 2 1 -> 3 0
        //0 4-> 1 3 -> 2 2 -> 3 1
        //0 5-> 1 4 -> 2 3 -> 3 2
        //1 5-> 2 4 ->3 3
        //2 5-> 3 4
        //3 5
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int num[][]=new int[n][m];//대각선
        int count=1;//대각선 채울 숫자

        //대각선의 첫 시작점
        //각 행의 첫번째 요소 = 0열?
        for(int i=0;i<m;i++){
            int row=0;
            int col=i;
            while (row < n && col >= 0){
                //ex) 0 2-> 1 1 -> 2 0 
                //row는 증가col은 감소하는 식으로 대각선 이동
                num[row][col]=count++;
                row++;
                col--;
            }
        }

        //이쪽은 1열부터
        for(int j=1;j<n;j++){
            int row=j;
            int col=m-1;
            while (row < n && col >= 0){
                num[row][col]=count++;
                row++;
                col--;
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                System.out.print(num[x][y] + " ");
            }
            System.out.println();
        }
    }
}