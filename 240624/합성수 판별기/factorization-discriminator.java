import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        boolean okay=false;

        for(int i=2;i<n-1;i++){
            if(n%i==0){
                okay=true;
            }
        }

        if(okay){
            System.out.println("C");
        }else{
            System.out.println("N");
        }
    }
}