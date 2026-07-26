import java.util.*;

public class B_Reverse_a_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {

                int maxVal = a[i];
                int maxPos = i;
                for (int j = i; j < n; j++) {
                    if (a[j] > maxVal) {
                        maxVal = a[j];
                        maxPos = j;
                    }
                }
                if (maxVal > a[i]) {
                    reverse(a, i, maxPos);
                    break;
                }
            }
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}
