import java.util.*;

public class Main {
    public static void main(String[] args) {
        //홀수는 0~ 빼기
        //짝수는 n-1~ 빼기
        //5 1 4 2 3 |3 2 4 1 5
        //=>홀 5 4 3 2 1
        //=>짝 1 2 3 4 5
        //4 1 3 2|2 3 1 4
        //=>홀 4 3 2 1
        //=>짝 1 2 3 4
        //3 1 2|2 1 3
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n-i ; j++){
                //홀수(5 4 3 2 1)
                System.out.print("* ");
            }
            System.out.println();

            for(int k=0 ; k<i+1 ; k++){
                //짝수(1 2 3 4 5)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}