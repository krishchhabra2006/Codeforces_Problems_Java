import java.util.*;
public class A_Divisible_Permutation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            
            int n=sc.nextInt();
            int l=1;
            int r=n;
            int []p =new int[n];
            for(int i=n-1;i>=0;i--){
                if((n-1 -i)%2==0){
                    p[i]=r--;

                }
                else{
                    p[i]=l++;
                }
                
            }
            for(int x:p )System.out.print(x+" ");
            System.out.println();

            
        }

    }
}