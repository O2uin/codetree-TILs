import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //질의 3종류 q개
        //q줄에 q개의 질의가 한 줄에 하나씩
        //1 a / 2 b / 3 s e 형식
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int q=scan.nextInt();
        int num[]=new int[n];

        for(int i=0;i<n;i++){
            num[i]=scan.nextInt();
        }

        for(int j=0;j<q;j++){
            //질의 받음
            int que=scan.nextInt();
            if(que==1){
                System.out.println(num[scan.nextInt()-1]);
            }else if(que==2){
                //값이 b인 원소를 찾아 몇번째 원소인지, 여러개라면 가장 처음 것, 없으면 0
                int b=scan.nextInt();
                boolean check=false;
                for(int k=0;k<n;k++){
                    if(num[k]==b){
                        System.out.println(k+1);
                        check=true;
                        break;
                    }
                    if(check=false) System.out.println("0");
                }
            }else if(que==3){
                int a=scan.nextInt();
                int b=scan.nextInt();
                for(int x=a-1;x<b;x++){
                    System.out.printf("%d ",num[x]);
                }
            }
        }
    }
}