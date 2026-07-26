import java.util.*;

public class B_Prefix_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            
            int n = sc.nextInt();
            int[] a = new int[n];
            int count=0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                count++;
            }
            int max=a[0];
            for(int i=0;i<n;i++){
                if(max<=a[i]){
                    max=a[i];
                }
            }
            System.out.println(count*max);    
        }

    }
}