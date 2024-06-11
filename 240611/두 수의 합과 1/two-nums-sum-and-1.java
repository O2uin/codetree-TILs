import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int count=0;

        int sum=a+b;
        //스트링 변환 가능?
        String result=String.valueOf(sum);

        for(int i=0;i<result.length();i++){
            if(result.charAt(i)=='1'){
                count++;
            }
        }

        System.out.println(count);
    }
}