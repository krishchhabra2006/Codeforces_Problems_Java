import java.util.*;

public class A_Friendly_Numbers {
    static int digitSum(long x){
        int sum=0;
        while(x>0){
            sum+=x%10;
            x/=10;
        }
        return sum;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            int count = 0;

            for (long y = x; y <= x + 90; y++) {
                if (y - digitSum(y) == x){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
