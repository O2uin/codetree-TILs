import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int num=0;
        int sumA=0;
        int sumB=0;

        for(int i=1;i<=10;i++){
            num=scan.nextInt();
            if(i%2==0){
                sumA+=num;
            }else{
                sumB+=num;
            }
        }
        if(sumA>sumB){
            System.out.println(sumA-sumB);
        }else{
            System.out.println(sumB-sumA);
        }
    }
}