import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String a=scan.next();
        String b=scan.next();
        String str="";
        boolean ok=true;
        int index=0;
        int i=0;

        int blen=b.length();
        for(i=0;i<a.length();i++){
            char n=a.charAt(i);
            if(n==b.charAt(0)){
                //1개일땐 어케하지
                for(int j=1;j<blen;j++){
                    if(i+j>=a.length() || a.charAt(i+j)!=b.charAt(j)) {
                        ok=false;
                        break;
                    }
                }
                if(ok){
                    //i부터 i+blen까지 제거 후 for문 수정해줌
                    for(int x=0;x<a.length();x++){
                        if(x<i || x>i+blen-1) str+=a.charAt(x);
                    }
                    a=str;
                    str="";
                    i=-1;
                }else{
                    ok=true;
                }

            }
        }
        System.out.println(a);
    }
}