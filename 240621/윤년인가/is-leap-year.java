import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int y=scan.nextInt();

        if(y%4==0){
            if(y%100==0&&y%400!=0){
                System.out.println("false");
            }else{
                System.out.println("true");
            }
            
        }else{
            System.out.println("false");
        }
    }
}