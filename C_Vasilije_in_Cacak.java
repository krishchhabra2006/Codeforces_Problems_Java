import java.util.*;

public class C_Vasilije_in_Cacak{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            long x=sc.nextLong();
            if(2*x>=k*(k+1) && 2*x<=(n*(n+1) - (n-k)*(n-k+1)) ) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}