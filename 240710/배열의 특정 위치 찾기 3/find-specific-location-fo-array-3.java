import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int num[]=new int[100];
        int p=0;

        for(int i=0;i<100;i++){
            num[i]=scan.nextInt();
            if(num[i]==0){
                p=i;
                break;
            }
        }

        System.out.println(num[p-1]+num[p-2]+num[p-3]);
    }
}