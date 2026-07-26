import java.util.*;

public class B_Large_Addition{
    static void digit(int n){
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            String s=sc.next();
            if(s.length()>=2 && s.charAt(0)=='1' &&  s.charAt(s.length()-1)!='9') System.out.println("YES");
            else System.out.println("NO");
        }
    }
}