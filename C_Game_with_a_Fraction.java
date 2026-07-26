import java.util.*;
public class C_Game_with_a_Fraction{
    public static void main(String[] args) {
        Scanner fs=new Scanner(System.in);
        int t = fs.nextInt();

        while (t-- > 0) {
            long p = fs.nextLong();
            long q = fs.nextLong();

            long K = Math.min(p / 2, q / 3);

            boolean bob;

            if (K == 0) {
                bob = false;
            } else if (K >= 2) {
                bob = true;
            } else {
                
                bob = ((p + q) % 2 == 1);
            }
            if(bob==true) System.out.println("bob");
            else System.out.println("Alice");
    
        }
    }
}

