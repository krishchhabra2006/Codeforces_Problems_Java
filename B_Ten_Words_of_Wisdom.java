
import java.util.*;
public class B_Ten_Words_of_Wisdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int maxi = -1; 
            int winnerIndex = -1; 
            int n=sc.nextInt();
            for (int i = 1; i <= n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt(); 
                if (a <= 10 && b > maxi) {
                    maxi = b; 
                    winnerIndex = i;
                }
            }
            System.out.println(winnerIndex);
        }
    }
}