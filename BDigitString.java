import java.util.*;

public class BDigitString {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int suf=0;
            int pref2=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1' ||s.charAt(i)=='3' ) suf++;
            }
            int ans=pref2+suf;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='2') pref2++;
                if(s.charAt(i)=='1' ||s.charAt(i)=='3') suf--;
                ans=Math.max(ans,pref2+suf);
            }
            System.out.println(s.length()-ans);
        }
    }
}
    

