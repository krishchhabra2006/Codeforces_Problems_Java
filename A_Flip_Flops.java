import java.util.*;

public class A_Flip_Flops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return ;
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long c=sc.nextLong();
            long k=sc.nextLong();
            long []a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            Arrays.sort(a);
            boolean flag=false;
            for(int i=0;i<n;i++){
                if(a[i]<=c){
                    long s =Math.min(k,c -a[i]);
                    c += (a[i] +s);
                    k -=s;
                }
                else{
                    break;
                }
            }
            System.out.println(c);

        }
    }
}