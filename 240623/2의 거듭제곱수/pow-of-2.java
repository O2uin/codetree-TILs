import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        //2로 계속 나눠주고 숫자 세면 되겠지ㅣ...
        while(n!=1){
            n/=2;
            count++;
        }
        System.out.println(count);
    }
}