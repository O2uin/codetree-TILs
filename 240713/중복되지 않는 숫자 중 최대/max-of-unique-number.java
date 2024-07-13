import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int num[]=new int[n];
        boolean index[]=new boolean[n];
        int max=-1;

        for(int y=0;y<n;y++){
            num[y]=scan.nextInt();
        }

        for(int i=0;i<n;i++){
            index[i]=true;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(num[i]==num[j]){
                        index[i]=false;
                        break;
                    }
                }
                if(index[i]){
                    max=num[i];
                }
            }
            
        }

        for(int x=0;x<n;x++){
            if(num[x]>max&&index[x]==true){
                max=num[x];
            }
        }

        System.out.println(max);
    }
}