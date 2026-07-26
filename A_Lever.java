import java.util.*;

public class A_Lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            int S=0;
            for(int i=0;i<n;i++){
                if(a[i]>b[i]){
                    S+=(a[i]-b[i]);
                }
                
            }

            if(S==0 ) System.out.println(1);
            else{
                System.out.println(S+1);
            }
        }
    }
}
