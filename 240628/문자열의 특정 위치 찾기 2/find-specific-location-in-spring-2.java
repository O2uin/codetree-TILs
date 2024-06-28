import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String[] a={"apple", "banana","grape", "blueberry", "orange"};
        char b=scan.next().charAt(0);
        int count=0;

        for(int i=0;i<5;i++){
            if(a[i].charAt(2)==b || a[i].charAt(3)==b){
                System.out.println(a[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}