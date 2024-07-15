import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int max=1;
        int min=1000;

        for(int i=0;i<10;i++){
            num[i]=scan.nextInt();
            if(num[i]>500){
                //500 초과 min
                if(num[i]<min){
                    min=num[i];
                }
            }else if(num[i]<500){
                //500 미만 max
                if(num[i]>max){
                    max=num[i];
                }
                
            }
        }

        System.out.printf("%d %d ",max,min);
    }
}