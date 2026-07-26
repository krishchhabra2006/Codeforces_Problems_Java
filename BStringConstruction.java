import java.util.Scanner;

public class BStringConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            return;
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k == n - 1) {
                out.append("-1\n");
                continue;
            }
            int c0 = (n + 1) / 2;
            int c1 = n / 2;
            StringBuilder sb = new StringBuilder();
            int p0 = Math.min(k, c0 - 1);
            for (int i = 0; i < p0 + 1; i++)
                sb.append('0');
            c0 -= (p0 + 1);
            k -= p0;

            int p1 = Math.min(k, c1 - 1);
            for (int i = 0; i < p1 + 1; i++)
                sb.append('1');
            c1 -= (p1 + 1);
            k -= p1;

            while (c0 > 0 || c1 > 0) {
                if (sb.charAt(sb.length() - 1) == '0') {
                    sb.append('1');
                    c1--;
                } else {
                    sb.append('0');
                    c0--;
                }
            }
            out.append(sb).append("\n");
        }
        System.out.print(out);
        sc.close();
    }
}