import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int num1[][]=new int[3][3];
        int num2[][]=new int[3][3];

        for(int i=0;i<2;i++){
            for(int x=0;x<3;x++){
                for(int y=0;y<3;y++){
                    if(i==0){
                        num1[x][y]=scan.nextInt();
                    }else{
                        num2[x][y]=scan.nextInt();
                    }
                }
            }
        }

        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                System.out.printf("%d ",num1[a][b]*num2[a][b]);
            }
            System.out.println();
        }
    }
}