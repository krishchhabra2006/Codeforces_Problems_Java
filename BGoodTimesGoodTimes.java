import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BGoodTimesGoodTimes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            int length = Long.toString(x).length();
            long y = 1;
            for (int i = 0; i < length; i++) {
                y *= 10;
            }
            y += 1;

            sb.append(y).append("\n");
        }
        System.out.print(sb);
    }
}
