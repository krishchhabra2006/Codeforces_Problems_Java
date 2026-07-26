import java.util.*;
public class  C1WeBeFlippingEasyVersion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n=sc.nextInt();
            long[] a=new long[n+1];
            for (int i =0;i<n;i++){
                a[i]=sc.nextLong();
            }
           ArrayList<Integer>ops =new ArrayList<>();
            int flip=0;
            for(int i=n-1;i>=0;i--){
                long val=(flip==0?a[i]:-a[i]);
                if(val>0){
                    ops.add(i+1);
                    flip^=1;
                }
            }
            System.out.println(ops.size());
            for(int x:ops){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}