import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        char a=scan.next().charAt(0);
        char str[]={'L', 'E', 'B', 'R', 'O', 'S'};
        boolean check=false;
        for(int i=0;i<str.length;i++){
            if(a==str[i]){
                System.out.print(i);
                check=true;
            }
        }
        if(check==false) System.out.print("None");
    }
}