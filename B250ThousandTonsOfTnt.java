import java.util.*;
public class B250ThousandTonsOfTnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n=sc.nextInt();
            long[] a=new long[n];
            long min=Long.MAX_VALUE;
            long max=Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
                if(a[i]>max) max=a[i];
                else if (a[i]<min) min=a[i];
            }
            System.out.println(max-min);

        }
    }
}