import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int sum=0;
        int count=0;

        for(int i=a;i>1;i/=b){
            int z=i%b;
            count++;
        }

        int[] num=new int[count];

        for(int i=0;i<count;i++){
            a=a/b;
            num[i]=a%b;
        }

        for(int k=0;k<100;k++){
            int index=0;
            for(int l=0;l<count;l++){
                if(num[l]==k){
                    index++;
                }
            }
            sum+=index*index;

        }

        System.out.println(sum);
    }
}