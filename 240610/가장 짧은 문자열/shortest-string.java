import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String[] str=new String[3];
        int max=0, min=0;
        for(int i=0;i<3;i++){
            str[i]=scan.nextLine();
            if(i==0) {
                max=str[i].length();
                min=str[i].length();
            }
            if(max<str[i].length()){
                max=str[i].length();
            }
            if(min>str[i].length()){
                min=str[i].length();
            }
        }

        System.out.print(max-min);

        
    }
}