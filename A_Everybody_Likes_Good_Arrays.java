import java.util.*;

public class  A_Everybody_Likes_Good_Arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int prev = sc.nextInt();
            int operations = 0;
            for (int i = 1; i < n; i++) {
                int cur = sc.nextInt();
                if ((prev % 2) == (cur % 2)) {
                    operations++;
                }
                prev = cur;
            }

            System.out.println(operations);
        }
    }
}
