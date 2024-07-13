import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int num1[]=new int[n1];
        int num2[]=new int[n2];
        int index=0;
        String str1="";
        String str2="";

        for(int i=0;i<n1;i++){
            num1[i]=scan.nextInt();
        }
        for(int j=0;j<n2;j++){
            num2[j]=scan.nextInt();
            str2+=String.valueOf(num2[j]);
            
        }

        for(int k=0;k<n1;k++){
            if(num1[k]==num2[0]) {
                if(k+n2>n1) break;
                for(int x=0;x<n2;x++){
                    str1+=String.valueOf(num1[k+x]);
                }
                if(str1.equals(str2)) break;
                else str1="";
            }
        }

        
        if(str1.equals(str2)) System.out.println("Yes");
        else System.out.println("No");
        
    }
}