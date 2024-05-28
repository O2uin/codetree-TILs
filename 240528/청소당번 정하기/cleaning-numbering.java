import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //0일부터 2일마다 교실, 3일마다 복도, 12일마다 화장실
        //겹치는 날에는 주기가 긴 쪽(교실<복도<화장실)
        //n일 진행
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int to=0, lo=0, cl=0;


        for(int i=1;i<=n;i++){
            if(i%12==0){//12 24 36 48
                //화장실
                to++;
            }else if(i%3==0){//3 6 9 12 15 18 21 24 27 30 36
                //복도
                lo++;
            }else if(i%2==0){//2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36
                //교실
                cl++;
            }
        }

        System.out.printf("%d %d %d",cl, lo, to);
    }
}