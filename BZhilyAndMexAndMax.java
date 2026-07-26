import java.util.*;
public class BZhilyAndMexAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n+1];
            long mv = 0;
            int l=1;
            long k=0;
            long ans=0;
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
                if (a[i] > mv){
                    mv = a[i];
                    l=i;
                }
            }
            long temp=a[l];
            a[l]=a[1];
            a[1]=temp;
            if(n>1){
                Arrays.sort(a,2,n+1);
            }
            if(n>2){
                int j=2;
                for(int i=3;i<=n;i++){
                    if(a[i]!=a[j]) a[++j]=a[i];
                }
            }
            
            for(int i=1;i<=n;i++){
                while(a[i]==k || k==mv) k++;
                ans+=mv+k;
            }
            System.out.println(ans);
        }
    }
}
