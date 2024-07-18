import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count =1;
        String a="";
        for(int i=0;i<n;i++){
            String b=scan.next();
            a+=b;
        }

        for(int j=0;j<a.length();j++){
            System.out.print(a.charAt(j));
            if(count==5){
                System.out.println();
                count=0;
            }
            count++;
        }
    }
}