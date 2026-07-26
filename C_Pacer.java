import java.util.Scanner;

public class C_Pacer {
    public static void main(String[] args) {
        Scanner fs=new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            long m = fs.nextLong();
            long prevT = 0, ans = 0;
            int prevS = 0;

            for (int i = 0; i < n; i++) {
                long a = fs.nextLong();
                int b = fs.nextInt();
                long len = a - prevT;
                ans += (len % 2 == (prevS ^ b)) ? len : len - 1;
                prevT = a;
                prevS = b;
            }
            ans += m - prevT;
            out.append(ans).append('\n');
        }
        System.out.print(out);
    }
}
