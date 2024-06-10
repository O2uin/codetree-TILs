import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] num =new int[n];
        int max=10;

        for(int i=0; i<n;i++){
            num[i]=scan.nextInt();
        }

        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(max>num[k]-num[j]){
                    max=num[k]-num[j];
                }
            }
        }

        System.out.println(max);
    }
}