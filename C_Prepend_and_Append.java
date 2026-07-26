import java.util.*;
public class C_Prepend_and_Append {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int low=0;
            int n=sc.nextInt();
            int high=n-1;
            String s=sc.next();
            while(low<=high){
                if(s.charAt(low)!=s.charAt(high)){
                    low++;
                    high--;
                }
                else {
                    break;
                }
            }
            System.out.println(high-low+1);
            
        }
    }
}