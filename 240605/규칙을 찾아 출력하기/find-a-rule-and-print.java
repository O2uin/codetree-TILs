import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            //i=0 i=n-1 =>n개 출력하는 코드 추가하기
            if(i==0 || i==n-1){
                for(int j=0;j<n;j++){
                    System.out.print("* ");
                }
                 System.out.println();
            }else{
                //출력1 공백 출력2
                for(int a=0;a<i;a++){//i개수만큼
                     System.out.print("* ");
                }
                for(int k=1;k<n-i;k++){//공백
                    //i=1 4/2 3/3 2
                     System.out.print("  ");
                }
                for(int b=0;b<1;b++){
                    //1 1 1 1
                     System.out.print("* ");
                }
                 System.out.println();
            }
        }
    }
}

//공백이 3 2 1 이런 순서