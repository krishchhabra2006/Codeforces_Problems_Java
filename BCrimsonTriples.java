import java.util.Scanner;

public class BCrimsonTriples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long Triples = 0;
            for (int b = 1; b <= n; b++) {
                long mul = n / b;
                Triples += mul * mul;
            }
            System.out.println(Triples);
        }
        sc.close();
    }
}
