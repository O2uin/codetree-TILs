import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int line=2*n-1;
        //공백 2 1 0 (0이 되면 더이상 x)=>0이 되는 기준은 모양 전환점(line이 n과 같을때)
        //별 1 2 3 2 1
        for(int i=1;i<=line;i++){
            if(i>n){
                //공백코드 필요없음
                for(int j=0;j<2*n-i;j++){
                    System.out.print("@ ");
                }
                System.out.println();
            }else{
                for(int j=0;j<n-i;j++){
                    System.out.print("  ");
                }
                for(int k=0;k<i;k++){
                    System.out.print("@ ");
                }
                System.out.println();
            }
        }
    }
}