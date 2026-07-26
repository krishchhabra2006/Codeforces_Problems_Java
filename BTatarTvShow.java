import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BTatarTvShow {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String s = br.readLine().trim();
            int[] counts = new int[k];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    counts[i % k]++;
                }
            }
            boolean possible = true;
            for (int j = 0; j < k; j++) {
                if (counts[j] % 2 != 0) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}
