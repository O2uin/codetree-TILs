import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String strs[]=str.split(" ");
        for(int i=0;i<10;i++){    
            System.out.println(strs[i]);
        }
    }
}