import java.util.*;

public class A_Lucky{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n=s.length();
            int sumi=0;
            int sumf=0;
            for(int i=0;i<n;i++){
                if(i<=(n/2)-1){
                    sumi+=s.charAt(i);
                }
                else sumf+=s.charAt(i);
            }
            if(sumi==sumf) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}