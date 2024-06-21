import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int[] a=new int[3];
        a[0]=scan.nextInt();
        int max=a[0];
        for(int i=1;i<3;i++){
            a[i]=scan.nextInt();
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}