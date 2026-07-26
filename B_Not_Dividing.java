import java.util.*;

public class B_Not_Dividing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            long []a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
                if(a[i]==1) a[i]=2;

            }
            
            for(int i=1;i<n;i++){
                while(a[i]%a[i-1]==0){
                    a[i]++;
                }

            }
            for(long x:a){
                System.out.print(x+" ");
        
            }
            System.out.println();
        }
    }
}