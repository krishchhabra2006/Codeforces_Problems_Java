import java.util.*;
public class B_Chemistry{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int [] freq=new int [26];
            for(char c:s.toCharArray()){
                freq[c-'a']++;
            }
            int odd=0;
            for(int c:freq){
                if(c%2!=0) odd++;

            }
            if(odd<=k+1) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}