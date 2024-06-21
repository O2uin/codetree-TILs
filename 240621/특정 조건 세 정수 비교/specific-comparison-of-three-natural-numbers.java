import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int[] a= new int[3];
        int min=0;
        for(int i=0;i<3;i++){
            a[i]=scan.nextInt();
            if(min==0||min>a[i]){
                min=a[i];
            }
        }

        if(a[0]==min){
            System.out.print("1 ");
        }else{
            System.out.print("0 ");
        }

        if(a[0]==a[1] && a[1]==a[2] && a[0]==a[2]){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }
}