import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int max=scan.nextInt();
        for(int i=0;i<9;i++){
            int num=scan.nextInt();
            if(num>max) max=num;
        }
        System.out.println(max);
    }
}