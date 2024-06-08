import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int[] num=new int[n];
        int[] count=new int[9];
        for(int i=0;i<n;i++){
            num[i]=scan.nextInt();
            for(int j=1;j<10;j++){
                if(num[i]==j){
                    count[j-1]++;
                }
            }
            
        }

        for(int k=0;k<9;k++){
            System.out.println(count[k]);
        }
    }
}