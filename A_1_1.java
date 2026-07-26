import java.util.Scanner;

public class A_1_1{

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        boolean[] isPermanent = new boolean[n];

        if (s.charAt(0) == '0') isPermanent[0] = true;
        if (s.charAt(n - 1) == '0') isPermanent[n - 1] = true;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0' && s.charAt(i + 1) == '0') {
                isPermanent[i] = true;
                isPermanent[i + 1] = true;
            }
        }
        int maxOnes = 0;
        StringBuilder maxS = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (isPermanent[i]) {
                maxS.append('0');
            } else {
                maxS.append('1');
                maxOnes++;
            }
        }
        int minOnes = 0;
        int currentLen = 0;

        for (int i = 0; i < n; i++) {
            if (maxS.charAt(i) == '1') {
                currentLen++;
            } else {
                if (currentLen > 0) {
                    minOnes += (currentLen / 2) + 1;
                    currentLen = 0;
                }
            }
        }
        if (currentLen > 0) {
            minOnes += (currentLen / 2) + 1;
        }
        System.out.println(minOnes + " " + maxOnes);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                solve(sc);
            }
        }
        sc.close();
    }
}
