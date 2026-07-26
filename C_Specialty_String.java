import java.util.*;

public class  C_Specialty_String{
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        String input = sc.next();
        StringBuilder s = new StringBuilder(input);

        while (s.length() != 0) {
            boolean check = false;
            
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    s.delete(i, i + 2); 
                    check = true;
                    break;
                }
            }

            if (!check) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                solve(sc);
            }
        }
    }
}