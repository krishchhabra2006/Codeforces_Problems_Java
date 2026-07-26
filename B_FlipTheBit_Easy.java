import java.util.*;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = sc.nextInt();
                int p1 = sc.nextInt() - 1;

                int x = a[p1];
                int ops = 0;

                // Process left side: count blocks where a[i] != x
                int i = 0;
                while (i < p1) {
                    if (a[i] != x) {
                        ops++;
                        while (i < p1 && a[i] != x) i++;
                    } else {
                        i++;
                    }
                }

                // Process right side: count blocks where a[i] != x
                int j = p1 + 1;
                while (j < n) {
                    if (a[j] != x) {
                        ops++;
                        while (j < n && a[j] != x) j++;
                    } else {
                        j++;
                    }
                }

                System.out.println(ops);
            }
        }
    }
}
