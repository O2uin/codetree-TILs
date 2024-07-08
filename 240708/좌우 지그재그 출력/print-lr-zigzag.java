import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=1;
        //1 ++ ++ ++
        //+n -- -- --
        //+n ++ ++ ++
        //+n -- -- --
        //이런 방식?
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                for(int j=count;j<count+n;j++){
                    System.out.printf("%d ",j);
                }
                count+=n;
            }else{
                for(int j=count+n-1;j>=count;j--){
                    System.out.printf("%d ",j);
                }
                count+=n;
            }
            System.out.println();
        }

    }
}