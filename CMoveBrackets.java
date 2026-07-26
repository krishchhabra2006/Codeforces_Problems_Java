import java.util.Scanner;

public class CMoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int moves = 0;
            int balance = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(') {
                    balance++;
                } else {
                    balance--;
                }
                if (balance < 0) {
                    moves++;
                    balance = 0;
                }
            }
            System.out.println(moves);
        }
        sc.close();
    }
}
