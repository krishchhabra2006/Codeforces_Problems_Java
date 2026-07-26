
import java.util.*;

public class  A_Jellyfish_and_Undertale{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            long sum=b;

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            for(long x:arr){
                    sum+=Math.min(x,a-1);
                
            }    
            System.out.println(sum);
        }
    }
}