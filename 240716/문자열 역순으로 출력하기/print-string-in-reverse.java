import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str[]=new String[4];
        for(int i=0;i<4;i++){
            str[i]=scan.next();
        }
        for(int j=3;j>=0;j--){
            System.out.println(str[j]);
        }
    }
}