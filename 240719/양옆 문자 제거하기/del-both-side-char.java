import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int len=str.length();
        char arr[]=str.toCharArray();
        for(int i=0;i<len;i++){
            if(i!=1&&i!=len-2){
                System.out.print(arr[i]);
            }
        }
        
    }
}