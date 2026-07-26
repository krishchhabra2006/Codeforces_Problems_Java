import java.io.*;
import java.util.*;

public class  C_Dice_Roll_Sequence{
    static final int INF = (int)1e9;

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = fs.nextInt();

            int[][] dp = new int[n][7];
            for (int x = 1; x <= 6; x++)
                dp[0][x] = (a[0] == x ? 0 : 1);

            for (int i = 1; i < n; i++) {
                for (int x = 1; x <= 6; x++) {
                    dp[i][x] = INF;
                    for (int y = 1; y <= 6; y++) {
                        if (y != x && y != 7 - x) {
                            dp[i][x] = Math.min(dp[i][x],
                                dp[i - 1][y] + (a[i] == x ? 0 : 1));
                        }
                    }
                }
            }

            int ans = INF;
            for (int x = 1; x <= 6; x++)
                ans = Math.min(ans, dp[n - 1][x]);

            out.println(ans);
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
