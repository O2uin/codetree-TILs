import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int num[]=new int[n];
        int max=0;
        int price=0;
        //min 에 사서 max에 판매, 전체에서 min, max찾아다 빼기
        //아니면 미리 빼서 가장 큰거?
        for(int k=0;k<n;k++){
            num[k]=scan.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                price=num[j]-num[i];
                if(price>max){
                    max=price;
                }
            }
        }


        System.out.print(max);
    }
}