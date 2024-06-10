import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();

        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=scan.nextLine();
            
        }
        int count=0;
        int sum=0;
        char a=scan.next().charAt(0);

        for(int j=0;j<n;j++){
            if(str[j].charAt(0)==a){
                count++;
                sum+=str[j].length();
            }
        }
        double result=(double)sum/count;
        System.out.printf("%d %.2f",count, result );
    }
}