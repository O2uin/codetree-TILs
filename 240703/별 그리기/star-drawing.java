import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //'':2 1 0 1 2
        //* :1 3 5 3 1
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int line=2*n-1;
        for(int i=0;i<line;i++){
            if(i<n){
                //
                for(int j=1;j<n-i;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<1+(i*2);k++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                //
                for(int j=0;j<=i-n;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<line-((i-n)*2+2);k++){
                    //5 3 1
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}