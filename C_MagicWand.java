import java.util.*;
import java.io.*;

public class C_MagicWand {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> odd = new ArrayList<>();
            List<Integer> even = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a % 2 == 0) even.add(a);
                else odd.add(a);
            }

            StringBuilder sb = new StringBuilder();
            int i = 0, j = 0;
            while (i < odd.size() || j < even.size()) {
                if (i < odd.size() && (j == even.size() || odd.get(i) < even.get(j))) {
                    sb.append(odd.get(i++)).append(" ");
                } else {
                    sb.append(even.get(j++)).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
    }
}
