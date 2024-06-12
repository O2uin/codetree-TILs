import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String a=scan.next();//시작 문자열
        int n=a.length();
        int q=scan.nextInt();//요청 개수 q

        int[] num=new int[q];//요청
        //1->앞문자 빼고 나머지 한칸씩 앞으로/앞문자는 끝으로
        //결국엔 걍 앞에꺼가 뒤로가는거 아님? 이거 국어문제냐?
        //2->뒤문자 빼고 나머지 한칸씩 뒤로/뒤에 있던 문자를 앞으로
        //3->역순
        StringBuilder sb = new StringBuilder(a);
        String result;
        for(int i=0;i<q;i++){
            num[i]=scan.nextInt();
            if(num[i]==1){
                //
                result=a.substring(1) + a.substring(0,1);
                System.out.println(result);
                a=result;
            }else if(num[i]==2){
                //
                result=a.substring(n-1)+a.substring(0,n-1);
                System.out.println(result);
                a=result;
            }else{
                //
                char[] arr = a.toCharArray();
                for (int j = 0; j < n / 2; j++) {
                    char temp = arr[j];
                    arr[j] = arr[n - j - 1];
                    arr[n - j - 1] = temp;
                }
                a = new String(arr);
                System.out.println(a);
            }
        }
    }
}