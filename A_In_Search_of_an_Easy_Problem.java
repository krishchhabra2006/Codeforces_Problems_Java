import java.util.*;
public class A_In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hard = false;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                hard = true;
            }
        }
        if (hard) System.out.println("HARD");
        else System.out.println("EASY");
    }
}
