import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int nums[]=new int[n];
        nums[0]=scan.nextInt();
        int max=nums[0];
        int maxi=0;
        int index=0;

        for(int i=1;i<n;i++){
            nums[i]=scan.nextInt();
            if(max<nums[i]){ 
                max=nums[i];
                index=maxi;
                maxi=i;
            }
        }
        if(maxi==0) index=1;
        int count=0;
        int max2=nums[index];
        for(int j=0;j<n;j++){
            if(nums[j]==max) count++;
            else if(max2<nums[j]) max2=nums[j];
            if(count==2) {
                max2=max;
                break;
            }
            
        }
        System.out.printf("%d %d",max,max2 );
    }
}