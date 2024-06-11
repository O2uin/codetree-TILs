import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String a=scan.next();
        String b=scan.next();

        String aadd="";
        String badd="";

        //문자 인덱스 찾는 코드
        //그 인덱스로 슬라이싱
        //슬라이싱 된 값 인트로 변환
        //잘 모르겟으니 그냥 무식하게 돌리겠음ㅇㅇ
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=48 && a.charAt(i)<=57){
                //저장
                aadd+=String.valueOf(a.charAt(i));
            }else{
                break;
            }
        }
        
        for(int f=0;f<b.length();f++){
            if(b.charAt(f)>=48 && b.charAt(f)<=57){
                //저장
                badd+=String.valueOf(b.charAt(f));
            }else{
                break;
            }
        }

        int sum=Integer.parseInt(aadd)+Integer.parseInt(badd);
        System.out.println(sum);
    }
}