import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();

        if(a==1){
            System.out.println("John");
        }else if(a==2){
            System.out.println("Tom");
        }else if(a==3){
            System.out.println("Paul");
        }else{
            System.out.println("Vacancy");
        }
    }
}