import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        int q=scan.nextInt();
        char arr[]=s.toCharArray();

        for(int i=0;i<q;i++){
            //1: a와 b 위치 교환
            //2: a를 b로 교환
            
            int n=scan.nextInt();
            if(n==1){
                int a=scan.nextInt();
                int b=scan.nextInt();
                a--; b--;
                char temp=arr[a];
                arr[a]=arr[b];
                arr[b]=temp;
                for(char x:arr){
                    System.out.print(x);
                }System.out.println();
            }else{
                char a=scan.next().charAt(0);
                char b=scan.next().charAt(0);
                for(int z=0;z<arr.length;z++){
                    if(arr[z]==a) arr[z]=b;
                }
                for(char x:arr){
                    System.out.print(x);
                }System.out.println();
            }
        }
    }
}