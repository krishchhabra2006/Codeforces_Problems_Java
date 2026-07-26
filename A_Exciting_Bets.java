import java.util.*;
public class A_Exciting_Bets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        if(!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==b) {
                System.out.println("0 0");
            }
            else{
                long maxi=Math.abs(a-b);
                long movdown= a%maxi;
                long movup=maxi-movdown;
                long min=Math.min(movup,movdown);
                System.out.println(maxi+" "+min);
            }
        }
    }
}