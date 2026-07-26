import java.util.*;
public class B_NIT_Destroys_the_Universe{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            boolean flag=false;
            for (int i= 0;i<n;i++) {
                int a =sc.nextInt();
                if (a!=0) {
                    if (!flag){
                        count++;
                        flag = true;
                    }
                }
                else{
                    flag = false;
                }
            }
            if (count==0)System.out.println(0);
            else if(count==1) System.out.println(1);
            else System.out.println(2);
        }
    }
}
