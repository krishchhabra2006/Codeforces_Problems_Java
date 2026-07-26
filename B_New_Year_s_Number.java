import java.util.*;
public class B_New_Year_s_Number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int rem=n%2020;
            int x=(n-rem)/2020-rem;
            if(x>=0&&x*2020+rem*2021==n) {
                  System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}