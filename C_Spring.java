import java.util.*;

public class C_Spring {
    public static long getLCM(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a / getGCD(a, b) * b);
    }

     public static long getGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a=sc.nextInt();
            long b=sc.nextInt();
            long c=sc.nextInt();
            long m=sc.nextInt();




        }
    }
}