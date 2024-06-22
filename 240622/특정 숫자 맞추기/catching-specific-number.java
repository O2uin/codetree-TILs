import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        while(true){
            int n=scan.nextInt();
            if(n<25){
                System.out.println("Higher");
            }else if(n>25){
                System.out.println("Lower");
            }else{
                System.out.println("Good");
                break;
            }
        }
        
    }
}