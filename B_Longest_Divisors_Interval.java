import java.util.*;

public class  B_Longest_Divisors_Interval{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return ;
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            int k=1;
            while(n%k==0){
                k++;
            }
            System.out.println(k-1);
        }
    }
}