import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String str[]=new String[10];
        boolean check=false;
        for(int i=0;i<10;i++){
            str[i]=scan.next();
        }
        char a=scan.next().charAt(0);
        for(int j=0;j<10;j++){
            if(str[j].charAt(str[j].length()-1)==a){
                System.out.println(str[j]);
                check=true;
            }
        }

        if(!check){
            System.out.println("None");
        }
    }
}