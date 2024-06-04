import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int[] num=new int[5];
        int count=0;
        boolean result=false;

        for(int i=0;i<5;i++){
            num[i]=scan.nextInt();
            if(num[i]%3==0) count++;
        }

        if(count==5) System.out.println("1");
        else System.out.println("0");
    }
}