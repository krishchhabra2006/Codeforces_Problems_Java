import java.io.*;
import java.util.*;

public class B_Array_and_Permutation {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            int[] p = new int[n];
            int[] nums = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                p[i] = fs.nextInt();
                map.put(p[i], i + 1);
            }

            for (int i = 0; i < n; i++) {
                nums[i] = fs.nextInt();
            }

            int[] check = new int[n];

            for (int i = 0; i < n; i++) {
                check[i] = map.get(nums[i]);
            }

            boolean sorted = true;
            for (int i = 1; i < n; i++) {
                if (check[i] < check[i - 1]) {
                    sorted = false;
                    break;
                }
            }
            out.append(sorted ? "YES\n" : "NO\n");
        }

        System.out.print(out);
    }
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int nextInt() throws Exception {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return Integer.parseInt(st.nextToken());
        }
    }
}
