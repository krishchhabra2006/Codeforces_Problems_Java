import java.util.*;

public class A_Everyone_Loves_to_Sleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int H = sc.nextInt();
            int M = sc.nextInt();

            int sleep = H * 60 + M;
            int best = 1440; 
            for (int i = 0; i < n; i++) {
                int h = sc.nextInt();
                int m = sc.nextInt();

                int alarm = h * 60 + m;
                int diff = (alarm - sleep + 1440) % 1440;

                if (diff < best) best = diff;
            }

            int hours = best / 60;
            int minutes = best % 60;

            System.out.println(hours + " " + minutes);
        }

        sc.close();
    }
}
