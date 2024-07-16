import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] grid = new int[n][m];
        int count = 0;

        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                // 짝수 열은 위에서 아래로
                for (int i = 0; i < n; i++) {
                    grid[i][j] = count++;
                }
            } else {
                // 홀수 열은 아래에서 위로
                for (int i = n - 1; i >= 0; i--) {
                    grid[i][j] = count++;
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}