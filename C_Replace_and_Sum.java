import java.util.*;
public class C_Replace_and_Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q=sc.nextInt();
            int []a=new int[n+1];
            int []b= new int[n+1];
            for(int i=1;i<=n;i++) a[i]=sc.nextInt();
            for(int i=1;i<=n;i++) b[i]=sc.nextInt();

            long[] suf=new long[n+2];
            for(int j=n;j>=1;j--){
                b[j]=Math.max(a[j],b[j]);
                suf[j]= Math.max(b[j],suf[j+1]);

            }
                
            
            long[]prefix=new long[n+1];
            for(int i=1;i<=n;i++){
                prefix[i]=prefix[i-1]+suf[i];
            }
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                long ans = prefix[r] - prefix[l - 1];
                System.out.print(ans + " ");
            }

            System.out.println();    
        }
    }
}