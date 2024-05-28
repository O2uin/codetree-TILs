import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int cnt=0;
        int[] num=new int[10];

        Scanner scan=new Scanner(System.in);

        for(int i=0; i<10;i++){
            num[i]=scan.nextInt();
        }

        for(int x:num){
            if(x%2!=0){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}