import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String str[]=new String[n];
        int count=0;
        int all=0;

        for(int i=0;i<n;i++){
            str[i]=scan.next();
            all+=str[i].length();
            if(str[i].charAt(0)=='a'){
                count++;
            }
        }

        System.out.printf("%d %d",all,count);
    }
}