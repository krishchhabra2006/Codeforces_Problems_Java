import java.util.*;

public class Z_Equal_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x == y)
            System.out.println(0);
        else if (x < y)
            System.out.println(y - x);
        else if (x > y) {
            if (x % 2 == 0 && y % 2 == 0)
                System.out.println((x - y) / 2);
            else if (x % 2 == 0 && y % 2 != 0)
                System.out.println(((x - y) / 2) + 2);
            else
                System.out.println(((x - y) / 2) + 2);
        }

    }

}
