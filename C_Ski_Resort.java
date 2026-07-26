import java.util.Scanner;
public class  C_Ski_Resort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-- > 0) {
            int n =sc.nextInt();
            int k =sc.nextInt();
            int q =sc.nextInt();
            int[] a =new int[n];
            for(int i=0;i<n;i++){
                a[i] =sc.nextInt();
            }
            long ways=0;
            long len=0;
            for(int i=0;i<n;i++){
                if(a[i]<=q){
                    len++;
                } 
                else{
                    if(len>=k){
                        long N=len-k+1;
                        ways+=(N*(N+1))/2;
                    }
                    len=0;
                }
            }
            if(len>=k){
                long N=len-k+1;
                ways+=(N*(N+1))/2;
            }
            System.out.println(ways);
        }
    }
}
