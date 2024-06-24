import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        boolean okay=false;

        for(int i=a;i<=b;i++){
            if(i%c==0){
                okay=true;
            }
        }

        if(okay==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}