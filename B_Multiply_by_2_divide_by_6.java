import java.util.*;

public class B_Multiply_by_2_divide_by_6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a=0;
            int b=0;
            while(n%2==0){
                a++;
                n/=2;
            }    while(n%3==0){
                b++;
                n/=3;
            }
            if(n!=1 || a>b) System.out.println(-1);
            else {
                System.out.println(2*b-a);
            }
        }
    }
}