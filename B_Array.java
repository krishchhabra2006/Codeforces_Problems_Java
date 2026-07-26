import java.util.*;

public class B_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return ;
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long []a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < n; i++) {
                int h=0;
                int l=0;
                for (int j = i + 1; j < n; j++) {
                    if (a[j] > a[i]) h++;
                    else if (a[j] < a[i]) l++;
                }
                int count = Math.max(h,l);
                sb.append(count).append(i ==n-1? "" : " ");
            }
            System.out.println(sb.toString());
        }
    }
}