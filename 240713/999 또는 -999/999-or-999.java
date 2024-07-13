import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int max=scan.nextInt();
        int min=max;
        int num=0;
        while(true){
            num=scan.nextInt();
            if(num==999 || num==-999) break;
            if(num<min) min=num;
            if(num>max) max=num;
        }
        System.out.printf("%d %d",max, min);

    }
}