import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int[] num=new int[10];

        for(int i=0;i<10;i++){
            num[i]=scan.nextInt();
            if(num[i]%3==0){
                System.out.println(num[i-1]);
                break;
            }
            
        }


    }
}