
import java.util.*;
public class A_Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean flag = false;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (i + 2 < n &&
                    s.charAt(i) == '.' &&
                    s.charAt(i + 1) == '.' &&
                    s.charAt(i + 2) == '.') {
                    flag = true;
                    break;
                }
                if (s.charAt(i) == '.')
                    count++;
            }
            if (flag)
                System.out.println(2);
            else
                System.out.println(count);
        }
    }
}