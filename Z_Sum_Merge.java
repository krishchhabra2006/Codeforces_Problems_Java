
import java.util.*;

public class Z_Sum_Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int l = 0;
        int r = 0;
        int i = 0;
        while (l < n && r < n) {
            if (a[l] < b[r]) {
                ans[i] = a[l];
                l++;
                i++;
            } else {
                ans[i] = b[r];
                r++;
                i++;
            }
        }
        while (l < n) {
            ans[i] = a[l];
            l++;
            i++;
        }
        while (r < n) {
            ans[i] = b[r];
            r++;
            i++;
        }
        sc.close();
        int mid = n;
        System.out.println(ans[mid] + ans[mid + 1]);
    }
}
