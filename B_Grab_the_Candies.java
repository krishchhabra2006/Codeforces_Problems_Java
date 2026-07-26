import java.util.Scanner;

public class  B_Grab_the_Candies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int sumEven = 0;
            int sumOdd = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0) {
                    sumEven += x;
                } else {
                    sumOdd += x;
                }
            }

            if (sumEven > sumOdd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
