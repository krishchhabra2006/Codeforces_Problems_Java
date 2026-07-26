import java.util.*;

public class B_Seats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int count = 0;
            int existing = 0;

            for (char c : s.toCharArray()) {
                if (c == '1') existing++;
            }

            int i = 0;

            while (i < n) {
                if (s.charAt(i) == '1') {
                    i++;
                    continue;
                }

                int start = i;

                while (i < n && s.charAt(i) == '0') {
                    i++;
                }

                int length = i - start;

                boolean leftOne = (start - 1 >= 0 && s.charAt(start - 1) == '1');
                boolean rightOne = (i < n && s.charAt(i) == '1');

                if (!leftOne && !rightOne) {
                    count += (length +1) / 2;
                } else {
                    count += (length -1) / 2;
                }
            }

            System.out.println(existing + count);
        }
    }
}
