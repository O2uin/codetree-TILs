public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int num[][]=new int[5][5];

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==0||j==0){//행과 열이 0번째일때 1저장
                    num[i][j]=1;
                }else{//윗값+왼쪽값
                    num[i][j]=num[i-1][j]+num[i][j-1];
                }
            }
        }

        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                System.out.printf("%d ",num[x][y]);
            }
            System.out.println();
        }
        
    }
}