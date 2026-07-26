import java.util.*;

public class A_Divisible_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            if(n%2==0){
                for(int i=1;i<=n;i++) System.out.print(2*i +" ");
                System.out.println();

            }
            else{
                for(int i=1;i<=n;i++) System.out.print(i+" ");
                System.out.println();
                
            } 
        }
    }
}