import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scan=new Scanner(System.in);
        String a=scan.next();
        String save="";
        int count=1;

        char str[]=new char[a.length()];
        for(int i=0;i<a.length();i++){
            str[i]=a.charAt(i);
        }
        save+=str[0];
        if(a.length()==1) save+=count;
        for(int j=1;j<a.length();j++){
            if(str[j-1]==str[j]){
                count++;
                if(j==a.length()-1){
                    save+=count;
                }
            }else{
                save+=String.valueOf(count);
                count=1;
                save+=str[j];
                if(j==a.length()-1){
                    save+=count;
                }
            }
            
        }
        
        System.out.println(save.length()+"\r\n"+save);
    }
}