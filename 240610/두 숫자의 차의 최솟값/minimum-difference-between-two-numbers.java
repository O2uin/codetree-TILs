import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] num =new int[n];
        int max;

        for(int i=0; i<n;i++){
            num[i]=scan.nextInt();
        }

        max=num[1]-num[0];
        for(int j=0;j<n;j++){
            for(int k=n-1;k>j;k--){
                if(max>num[k]-num[j]){
                    max=num[k]-num[j];
                }
            }
        }

        System.out.println(max);
    }
}