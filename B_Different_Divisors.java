import java.util.*;
public class B_Different_Divisors{
    public static boolean isPrime(int n){
        if (n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while(t-->0){
            int d = s.nextInt();
            int p1=1+d;
            while(!isPrime(p1)){
                p1++;
            }
            int p2=p1+d;
            while(!isPrime(p2)){
                p2++;
            }
            System.out.println(p1*p2);
        }
    }
}
