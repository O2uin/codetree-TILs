import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] grid = new int[n][m];
        int count = 1;

        // 대각선으로 숫자 채우기
        // 첫 번째 행의 모든 열에 대해 대각선으로 채우기
        for (int startCol = 0; startCol < m; startCol++) {
            int row = 0;
            int col = startCol;
            while (row < n && col >= 0) {
                grid[row][col] = count++;
                row++;
                col--;
            }
        }

        // 첫 번째 열의 모든 행에 대해 대각선으로 채우기 (단, (0,0)은 이미 채웠으므로 제외)
        for (int startRow = 1; startRow < n; startRow++) {
            int row = startRow;
            int col = m - 1;
            while (row < n && col >= 0) {
                grid[row][col] = count++;
                row++;
                col--;
            }
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}