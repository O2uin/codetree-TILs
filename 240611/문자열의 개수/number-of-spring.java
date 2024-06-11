import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int count=0;
        String str="";
        while(true){
            String a=scan.nextLine();
            
            if(a.equals("0")){
                break;
            }
            if(count%2==0){
                //홀수번째(0부터 시작하니까 이게 맞음)저장
                str+=a+"\r\n";
            }
            count++;
        }

        System.out.println(count);
        System.out.print(str);
    }
}