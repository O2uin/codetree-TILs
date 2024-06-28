import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n*2;i++){
            if(i>n){//2 3 4 5 i=6 7 8 9 n=5 (i-n)+1
                for(int j=0;j<i-n+1;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else if(i==n){

            }else{//5 4 3 2 1
                for(int j=0;j<n-i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}