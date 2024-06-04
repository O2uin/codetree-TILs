import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=1 ; i<=2*n-1 ; i++){
            if(i<=n){//0 1 2 3줄(중간까지)
                //공백코드
                for(int k=n-i ; k>0 ; k--){
                    System.out.print(" ");
                }
                //증가식
                for(int j=0 ; j<i ; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{//i가 최소 4부터 시작함 -3해줘야 하는데 4 5 6 => 1 2 3
                //공백코드
                for(int k=0 ; k<i-n ; k++){
                    System.out.print(" ");
                }
                //감소식 n개수로 하는게 낫나 n-1 
                for(int j=n-(i-n) ; j>0 ; j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}