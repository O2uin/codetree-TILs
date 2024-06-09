import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String[] corona=new String[3];
        int[] temper=new int[3];
        int[] hospital=new int[4];

        for(int i=0;i<3;i++){
            corona[i]=scan.next();
            temper[i]=scan.nextInt();
        }

        for(int j=0;j<3;j++){
            if(corona[j].equals("Y")){
                if(temper[j]>36){
                    //a
                    hospital[0]++;
                }else{
                    //c
                    hospital[2]++;
                }
            }else{
                if(temper[j]>36){
                    //b
                    hospital[1]++;
                }else{
                    //d
                    hospital[3]++;
                }
            }
        }

        for(int k=0;k<4;k++){
            System.out.printf("%d ",hospital[k]);
        }

        if(hospital[0]>1){
            System.out.print("E");
        }
    }
}