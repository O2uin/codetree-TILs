import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n[]=new int[m];
        for(int i=0;i<m;i++){
            n[i]=scan.nextInt();
        }
        
        int count=0;

        for(int j=0;j<m;j++){
            while(true){
                if(n[j]==1) {
                    System.out.println(count);
                    count=0;
                    break;
                }
                if(n[j]%2==0){
                    n[j]/=2;
                }else{
                    n[j]=n[j]*3+1;
                }
                count++;
            }
            
        }
        
    }
}