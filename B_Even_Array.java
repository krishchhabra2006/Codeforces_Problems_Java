import java.util.*;
public class B_Even_Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int eveni=0,oddi=0,even=0,odd=0;
            int count=0;
            int n=sc.nextInt();
            int []a=new int[n];
            for(int i=0;i<n;i++){
                int x=sc.nextInt();

                if(i%2==0)eveni++;
                else oddi++;
                if(x%2==0) even++;
                else odd++;
                if(i%2!=x%2) count++;
            }
            if(eveni!=even ||oddi!=odd) System.out.println(-1);
            else
                System.out.println(count/2);

        }
    }
}
