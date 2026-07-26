import java.util.Scanner;

public class C_Hard_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                long m = sc.nextLong();
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();

                long Row1 = Math.min(a, m);
                long Row2 = Math.min(b, m);
                
                long remSeats = (m - Row1) + (m - Row2);
                long seatedNoPref = Math.min(c, remSeats);

                System.out.println(Row1 +Row2 + seatedNoPref);
            }
        }
        sc.close();
    }
}
