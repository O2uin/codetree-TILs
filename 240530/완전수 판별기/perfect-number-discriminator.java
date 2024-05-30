import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        //int[] num;//리스트 써야하나??
        List<Integer> num=new ArrayList<>();

        int sum=0;

        for(int i=1;i<n;i++){
            if(n%i==0){
                num.add(i);
            }
        }
        int[] number=new int[num.size()];
        for (int i = 0 ; i < num.size() ; i++) 
            number[i] = num.get(i).intValue();


        //리스트 값 다 더해서 n 나오면 완전수
        for(int x:number){
            sum+=x;
        }

        if(sum==n){
            System.out.println("P");
        }else{
            System.out.println("N");
        }
    }
}