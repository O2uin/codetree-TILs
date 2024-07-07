import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=1;

        for(int i=1;i<=n;i++){
            if(i%2==0){
                count=n;
                for(int j=0;j<n;j++){
                    System.out.print(count);
                    count--;
                }
            }else{
                count=1;
                for(int j=0;j<n;j++){
                    System.out.print(count);
                    count++;
                }
            }
            System.out.println();
        }
    }
}