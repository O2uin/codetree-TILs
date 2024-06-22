import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int stack=0;
        while(scan.hasNext()){
            int a=scan.nextInt();
            if(a%2==0){
                System.out.println(a/2);
                stack++;
            }
            if(stack==3) break;
        }
    }
}