import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int[] num=new int[9];
        while(true){
            int a=scan.nextInt();
            if(a==0) break;
            for(int i=1;i<=9;i++){
                if(a/10==i){
                    num[i-1]++;
                }
            }
        }

        for(int j=1;j<10;j++){
            System.out.println(j+" - "+num[j-1]);
        }
    }
}