import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);

        double right=scan.nextDouble();
        double left=scan.nextDouble();

        if(right>=1.0&&left>=1.0){
            System.out.println("High");
        }else if(right>=0.5&&left>=0.5){
            System.out.println("Middle");
        }else{
            System.out.println("Low");
        }
    }
}