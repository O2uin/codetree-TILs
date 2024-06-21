import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        char[] a=new char[3];
        int[] b=new int[3];
        int count=0;

        for(int i=0;i<3;i++){
            a[i]=scan.next().charAt(0);
            b[i]=scan.nextInt();
            if(a[i]=='Y'){
                if(b[i]>=37){
                    //A
                    count++;
                }
            }
        }

        if(count>1){
            System.out.println("E");
        }else{
            System.out.println("N");
        }


    }
}