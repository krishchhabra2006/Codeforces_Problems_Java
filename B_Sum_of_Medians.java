import java.util.*;

public class B_Sum_of_Medians {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] a = new long[n * k];

            for (int i = 0; i < n * k; i++) {
                a[i] = sc.nextLong();
            }
            int ele = n-(n+1)/2;
            int step=ele+1;
            int index = n*k -step;
            long sum = 0;
            for(int i = 0; i < k; i++){
                sum += a[index];
                index -= step;
            }
            System.out.println(sum);
        }
    }
}