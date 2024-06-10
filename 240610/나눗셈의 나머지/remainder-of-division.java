import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int sum=0;
        int count=0;

         int temp = a;
        while (temp > 1) {
            count++;
            temp /= b;
        }

        int[] num = new int[count];

        temp = a;  // temp를 다시 a로 초기화
        for (int j = 0; j < count; j++) {
            num[j] = temp % b;
            temp /= b;
        }

        for (int k = 0; k < 100; k++) {
            int index = 0;
            for (int l = 0; l < count; l++) {
                if (num[l] == k) {
                    index++;
                }
            }
            sum += index * index;
        }

        System.out.println(sum);
    }
}