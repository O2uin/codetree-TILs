import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        String lr=scan.nextLine();
        int countL=0;
        int countR=0;

        for(int i=0;i<lr.length();i++){
            if(lr.charAt(i)=='L'){
                countL++;
            }else{
                countR++;
            }
        }

        String result;
        if(countL>countR){
            //countL-countR 만큼 왼쪽으로 밀기
            //앞에서부터 개수만큼 떼어서 뒤로
            int index=countL-countR;
             result=a.substring(index)+a.substring(0, index);
        }else if(countL<countR){
            //countR-countL 만큼 오른쪽으로 밀기
            int index=countR-countL;
            result=a.substring(index)+a.substring(0, index);
        }else{
            result=a;
        }

        System.out.println(result);
    }
}