import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='e'){
                //i가 인덱스
                str=str.substring(0, i)+str.substring(i + 1);
                break;
            }
        }


        System.out.println(str);
    }
}