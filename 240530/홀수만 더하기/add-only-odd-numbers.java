import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] num=new int[n];
        int i=0;
        int sum=0;

        while(i<n){
            num[i]=scan.nextInt();
            i++;
        }

        for(int x:num){
            if(x%2!=0 && x%3==0){
                sum+=x;
            }
        }

        System.out.println(sum);


    }
}