import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        //1 5 / 2 4 / 3
        //1 4 / 2 4 
        //1 3 / 2
        //1, n/ 1+1, n-1
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
                if(j%2==0){
                    System.out.printf("%d",n-i);
                }else{
                    System.out.printf("%d",1+i);
                }
            }
            System.out.println();
        }
    }
}