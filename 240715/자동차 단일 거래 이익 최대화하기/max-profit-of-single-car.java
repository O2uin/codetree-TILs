import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int num[]=new int[n];
        int min=-1;
        int max=0;
        int index=0;
        //min 에 사서 max에 판매, 전체에서 min, max찾아다 빼기

        for(int i=0;i<n;i++){
            num[i]=scan.nextInt();
            if(min==-1) min=num[i];
            if(num[i]<min){
                min=num[i];
                index=i;
            }
        }
        

        for(int j=index;j<n;j++){
            if(num[j]>max){
                max=num[j];
            }
        }

        System.out.print(max-min);
    }
}