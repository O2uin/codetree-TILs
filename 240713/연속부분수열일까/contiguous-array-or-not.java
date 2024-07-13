import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int num1[]=new int[n1];
        int num2[]=new int[n2];
        boolean check=false;

        for(int i=0;i<n1;i++){
            num1[i]=scan.nextInt();
        }
        for(int j=0;j<n2;j++){
            num2[j]=scan.nextInt();
        }

        for(int k=0;k<n1;k++){
            if(num1[k]==num2[0]){
                check=false;
                for(int x=0;x<n2;x++){
                    if(num1[k+x+1]!=num2[x]) {
                        check=true;
                        break;
                    }
                }
            }else{
                check=true;
            }
        }

        if(check==true){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}