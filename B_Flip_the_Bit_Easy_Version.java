import java.util.*;
import java.io.*;

public class B_Flip_the_Bit_Easy_Version{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt(); // k is always 1 in Easy Version
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int p1 = sc.nextInt() - 1; // 0-indexed special index
            int x = a[p1]; // Target value

            int ans = 0;

            // Handle the left side: index 0 to p1
            // If the leftmost element isn't x, it needs an operation.
            if (a[0] != x) {
                ans++;
            }
            // Count transitions moving from left to p1
            for (int i = 0; i < p1; i++) {
                if (a[i] != a[i + 1]) {
                    ans++;
                }
            }

            // Handle the right side: index n-1 down to p1
            // If the rightmost element isn't x, it needs an operation.
            if (a[n - 1] != x) {
                ans++;
            }
            // Count transitions moving from right to p1
            for (int i = n - 1; i > p1; i--) {
                if (a[i] != a[i - 1]) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
