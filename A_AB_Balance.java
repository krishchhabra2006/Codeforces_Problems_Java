import java.util.*;
public class A_AB_Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-- > 0) {
            String s=sc.next();
            char first=s.charAt(0);
            char last=s.charAt(s.length() - 1);
            if (first != last){
                StringBuilder sb =new StringBuilder(s);
                sb.setCharAt(s.length() - 1,first);
                s=sb.toString();
            }
            System.out.println(s);
        }
    }
}