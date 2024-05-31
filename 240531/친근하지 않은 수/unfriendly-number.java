import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;

        //친근한 수...같은게 왜 존재하지?
        for(int i=1;i<=n;i++){
            if(i%2!=0 && i%3!=0 && i%5!=0){
                count++;
            }
        }

        System.out.println(count);
    }
}