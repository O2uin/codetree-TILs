import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        String b=scan.nextLine();
        //한쪽으로 밀어서 처음으로 돌아오면 -1출력
        for(int i=1;i<=a.length();i++){
            if(i==a.length()){
                System.out.println("-1");
                break;
            }
            //아 이거 좌측인데 우측으로
            // result=a.substring(a.length()-id)+a.substring(0, a.length()-id);
            String a1="";
            a1=a.substring(a.length()-i)+a.substring(0, a.length()-i);
            if(a1.equals(b)){
                System.out.println(i);
                break;
            }
        }
    }
}