import java.io.*;
import java.util.*;

public class C1SeatingArrangementEasyVersion{
    static int[][] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            while (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            String a = st.nextToken();

            memo = new int[n][x + 1];
            for (int i = 0; i < n; i++) {
                Arrays.fill(memo[i], -2);
            }

            int eia = 0;
            for (int j = 0; j <= x; j++) {
                eia = Math.max(eia, solve(a, n - 1, j, s));
            }
            out.append(eia).append("\n");
        }
        System.out.print(out);
    }

    static int solve(String a, int idx, int j, int s) {
        if (j < 0) return -1;
        if (idx == -1) return (j == 0) ? 0 : -1;
        if (memo[idx][j] != -2) return memo[idx][j];

        int best = -1;
        int skip = solve(a, idx - 1, j, s);
        if (skip != -1) best = Math.max(best, skip);

        if (a.charAt(idx) == 'I') {
            int prev = solve(a, idx - 1, j - 1, s);
            if (prev != -1) best = Math.max(best, prev + 1);
        } else if (a.charAt(idx) == 'E') {
            int prev = solve(a, idx - 1, j, s);
            if (prev != -1) {
                int available = (j * s) - prev;
                if (available > 0) best = Math.max(best, prev + 1);
            }
        } else if (a.charAt(idx) == 'A') {
            int prevNew = solve(a, idx - 1, j - 1, s);
            if (prevNew != -1) best = Math.max(best, prevNew + 1);

            int prevExist = solve(a, idx - 1, j, s);
            if (prevExist != -1) {
                int available = (j * s) - prevExist;
                if (available > 0) best = Math.max(best, prevExist + 1);
            }
        }

        return memo[idx][j] = best;
    }
}
