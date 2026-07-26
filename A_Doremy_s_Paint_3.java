import java.util.*;

public class A_Doremy_s_Paint_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            if (n == 2) {
                System.out.println("Yes");
                continue;
            }

            
            Arrays.sort(a);
            
            int distinct = 1;
            int max_count = 1, current = 1;
            
            for (int i = 1; i < n; i++) {
                if (a[i] != a[i-1]) {
                    distinct++;
                    current = 1;
                } else {
                    current++;
                }
                max_count = Math.max(max_count, current);
            }
            
            if (distinct > 2) {
                System.out.println("No");
            } else {
                if(max_count==n) {
                    System.out.println("Yes");
                    continue;
                }
                int limit = (n + 1) / 2; // ceil(n/2)
                System.out.println(max_count <= limit ? "Yes" : "No");
            }
        }

    }
}
