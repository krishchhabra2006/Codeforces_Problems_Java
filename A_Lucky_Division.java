import java.util.*;

public class A_Lucky_Division {
    static boolean isLucky(int x) {
        while (x > 0) {
            int d = x % 10;
            if (d != 4 && d != 7) return false;
            x /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 1000; i++) {
            if (isLucky(i) && n % i == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}