import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        String goal=scan.next();
        boolean check=true;

        for(int i=0;i<str.length();i++){
            if(i+goal.length()>str.length()) break;
            String eq=str.substring(i,i+goal.length());
            if(eq.equals(goal)){
                System.out.print(i);
                check=false;
            }
        }

        if(check){
            System.out.print("-1");
        }
    }
}