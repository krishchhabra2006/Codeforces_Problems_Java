import java.util.*;
public class A_Only_One_Digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int ans=9;
            int x=sc.nextInt();
            while(x>0){
                int d=x%10;
                ans=Math.min(ans,d);
                x/=10;
                
            }
            System.out.println(ans);
        }
    }
}