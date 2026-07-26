import java.io.*;
import java.util.*;

public class B_Heapify_1{
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int[] a = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = fs.nextInt();
            }

            boolean ok = true;

            for (int i = 1; i <= n; i++) {
                int pos = i;
                int val = a[i];

                while (pos % 2 == 0) pos /= 2;
                while (val % 2 == 0) val /= 2;

                if (pos != val) {
                    ok = false;
                    break;
                }
            }

            out.println(ok ? "YES" : "NO");
        }

        out.flush();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}
