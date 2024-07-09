import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        char num[]=new char[10];
        for(int i=0;i<10;i++){
            num[i]=scan.next().charAt(0);
        }
        for(int j=9;j>=0;j--){
            System.out.print(num[j]);
        }
    }
}