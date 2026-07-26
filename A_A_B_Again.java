
import java.util.*;

public class A_A_B_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int a=sc.nextInt();
            int temp=a;
            int sum=0;
            while(temp>0){
                int digit=temp%10;
                temp/=10;
                sum+=digit;
            }
            System.out.println(sum);
        }
    }
}