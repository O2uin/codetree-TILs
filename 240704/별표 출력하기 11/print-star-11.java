import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        //1칸당 별 8개, 전체 n*n칸
        //=>2를 받으면 4칸
        //2*n - 1 => 줄수, 한 면 길이
        //줄당 칸 개수 = n개, 짝수면에 칸 생김
        int line=2*n+1;
        for(int i=1;i<=line;i++){
            if(i%2!=0){
                for(int j=0;j<line;j++){
                    System.out.print("* ");
                }
            }else{
                //별은 n+1개 공백은 n개 번갈아가면서 출력
                for(int j=0;j<n+1;j++){
                    System.out.print("*   ");
                }
            }
            System.out.println();
        } 
    }
}