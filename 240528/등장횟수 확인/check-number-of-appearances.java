import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int[] num=new int[5];
        int result=0;

        Scanner scan=new Scanner(System.in);

        for(int i=0; i<5;i++){
            num[i]=scan.nextInt();
        }

        for(int x:num){
            if(x%2==0){
                result++;
            }
        }

        System.out.println(result);
    }
}