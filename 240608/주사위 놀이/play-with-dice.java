import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int[] num=new int[10];
        int[] count=new int[6];
        for(int i=0;i<10;i++){
            num[i]=scan.nextInt();
            for(int j=0;j<6;j++){
                if(num[i]==j+1){
                    count[j]++;
                }
            }
        }

        for(int k=1;k<7;k++){
            System.out.println(k+" - "+count[k-1]);
        }
    }
}