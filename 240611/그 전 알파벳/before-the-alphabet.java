import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        //그 뭐냐 아스키코드값? --를 하되 97=a아래로 가면 122으로 바꾸고 --
        char ap=scan.next().charAt(0);
        if(ap<97){
            ap=122;
        }else{
            ap--;
        }

        System.out.println(ap);
    }
}