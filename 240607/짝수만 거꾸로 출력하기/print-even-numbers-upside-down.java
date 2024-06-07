import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String result="";

        for(int i=0;i<n;i++){
            int a=scan.nextInt();
            if(a%2==0){
                result=Integer.toString(a)+" "+result;
            }
        }

        System.out.println(result);
    }
}