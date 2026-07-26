import java.util.*;
public class B_Swap_and_Delete {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t =s.nextInt();
        while(t-->0){
            int count1=0;
            int count0=0;
            String str=s.next();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='1') count1++;
                else count0++;
            }
            int res=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1' && count0>0){
                    count0--;
                    res++;
                    
                }
                else if(str.charAt(j)=='0'&& count1>0){
                    count1--;
                    res++;
                }
                else{
                    break;
                }
            }
            System.out.println(str.length()-res);
        }
    }
}