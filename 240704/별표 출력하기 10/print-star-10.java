import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=n;
        int b=1;
        for(int i=0;i<n*2;i++){
            if(i%2!=0){
                //3 2 1
                for(int j=0;j<a;j++){
                    System.out.print("* ");
                }
                a--;
            }else{
                //1 2 3
                for(int j=0;j<b;j++){
                    System.out.print("* ");
                }
                b++;
            }
            System.out.println();
        }
    }
}