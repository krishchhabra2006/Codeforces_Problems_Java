import java.util.*;

public class A_Ambitious_Kid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long minAbs = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();

            if (x == 0) {
                System.out.println(0);
                return;
            }

            minAbs = Math.min(minAbs, Math.abs(x));
        }

        System.out.println(minAbs);
    }
}
