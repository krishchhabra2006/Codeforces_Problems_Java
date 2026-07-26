import java.util.*;

public class B_Make_Them_Odd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            HashSet<Long> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();

                while (x % 2 == 0) {
                    set.add(x);
                    x = x / 2;
                }
            }
            System.out.println(set.size());
        }
    }
}
