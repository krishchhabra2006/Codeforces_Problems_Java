import java.util.Scanner;

public class A_Pizza_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                long n = sc.nextLong();
                
                if (n < 3) {
                    System.out.println(0);
                } else {
                    long result = (n - 1) / 2;
                    System.out.println(result);
                }
            }
        }
        sc.close();
    }
}