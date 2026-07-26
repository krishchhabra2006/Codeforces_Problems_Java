import java.util.*;

public class BFairNumbers {
    public static boolean fair(long n){
        long temp=n;
        while(temp>0){
            long d=temp%10;
            if(d!=0 && n%d!=0) return false;
            temp/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            while(!fair(n)) n++;
            System.out.println(n);
        }
    }
}
