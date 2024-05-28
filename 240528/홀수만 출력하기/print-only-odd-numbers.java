import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int[] n;
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        n=new int[num];
        for(int i=0;i<num;i++){
            n[i]=scan.nextInt();
        }

        for(int x:n){
            if(x%2!=0 && x%3==0){
                System.out.println(x);
            }
        }

    }
}