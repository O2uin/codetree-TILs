import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int count=0;

        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i%2!=0){
                    //홀수=1증가
                    count++; 
                    System.out.printf("%d ",count);
                }else{
                    //짝수=2증가
                    count+=2;
                    System.out.printf("%d ",count);
                }
                
            }System.out.println();
            
        }
    }
}