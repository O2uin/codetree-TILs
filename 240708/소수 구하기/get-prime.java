import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        boolean ok=false;

        for(int i=1;i<=n;i++){
            for(int j=2;j<i;j++){
                if(i<j || i%j==0) {
                    ok=false;
                    break;
                }else{
                    ok=true;
                }
            }
            if(ok==true){
                System.out.printf("%d ",i);
            }
            ok=true;
        }
    }
}