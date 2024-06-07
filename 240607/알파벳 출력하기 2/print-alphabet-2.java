import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        char a=65;

        for(int i=0;i<n;i++){
            //A~Z 아스키 =65~90 
            for(int k=0;k<i;k++){
                System.out.print("  ");
            }
            for(int j=n-i;j>0;j--){
                System.out.printf("%s ",a);
                a++;
                if(a>90){
                    a=65;
                }
            }
            System.out.println();
        }
    }
}