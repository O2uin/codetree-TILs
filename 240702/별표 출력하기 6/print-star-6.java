import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //2n-1줄
        //* => 2n-1부터 2씩 줄고, 1이 되면 다시 2씩 커짐
        //공백 => 0 1 2 3 2 1 0
        //(n/2)+1번째 줄 = * 1개, 전환점
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int line=2*n-1;

        //4=> 0 1 2 3 | 2 1 0
        //    7 5 3 1 | 3 5 7
        //i 5 6 7
        //line-i 2 1 0 i-(line-i)
        //n=4, i=5, => 2*n-i-2 (2*n-1)-1-i
        for(int i=0;i<line;i++){//2n-1줄
            if(i>=n){
                //전환점 지났다
                for(int j=1;j<line-i;j++){
                    System.out.print("  ");
                }
                for(int k=0;k<=2*i-line+1;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int k=0;k<i;k++){//공백코드
                    //0부터 순서대로 커지기
                    System.out.print("  ");
                }
                for(int j=0;j<line-(i*2);j++){//*코드
                    //2n-1개부터 i*2개씩 줄어듦
                    System.out.print("* ");
                }
                System.out.println();
            }
            
        }
    }
}