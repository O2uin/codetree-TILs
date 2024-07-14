import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int num[]=new int[n];
        num[0]=scan.nextInt();
        int max =num[0];
        int index=n;
        //최댓값 위치 출력, 많을때는가장 왼쪽, 첫번째 원소가 뽑힐때까지
        for(int i=1;i<n;i++){
            num[i]=scan.nextInt();
            if(num[i]>max) max=num[i];
        }

        while(true){
            if(index==0) break;

            for(int j=0;j<index;j++){
                if(num[j]==max){
                    index=j;
                    System.out.printf("%d ",index+1);
                    max=num[0];
                    break;
                }
            }
            
            for(int k=0;k<index;k++){
                if(max<num[k]){
                    max=num[k];
                }
            }

            
        }
    }
}