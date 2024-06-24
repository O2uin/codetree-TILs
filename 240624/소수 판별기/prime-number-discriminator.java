import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        boolean check=false;

        for(int i=2;i<n;i++){
            if(n%i==0){
                check=true;
                break;
            }
        }

        if(check){
            System.out.println("C");
        }else{
            System.out.println("P");
        }
    }
}