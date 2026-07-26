import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BSeats {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        if (line == null)
            return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            char[] s = br.readLine().trim().toCharArray();

            List<Integer> ones = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s[i] == '1') {
                    ones.add(i);
                }
            }

            int totalStudents = ones.size();

            if (ones.isEmpty()) {
                totalStudents = (n + 2) / 3;
            } else {

                int firstK = ones.get(0);
                totalStudents += (firstK + 1) / 3;

                for (int i = 0; i < ones.size() - 1; i++) {
                    int k = ones.get(i + 1) - ones.get(i) - 1;
                    totalStudents += k / 3;
                }

                int lastK = n - 1 - ones.get(ones.size() - 1);
                totalStudents += (lastK + 1) / 3;
            }

            sb.append(totalStudents).append("\n");
        }

        System.out.print(sb.toString());
    }
}