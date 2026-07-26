import java.util.*;

public class B_Expensive_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n=s.length();
            boolean check=false;
            int zeros=0;
            int index=0;
            for(int i=n-1;i>=0;i--){
                if(check==false && s.charAt(i)!='0'){
                    check=true;
                    index=i;
                }
                if(check==true && s.charAt(i)=='0'){
                    zeros++;
                }
            }
            System.out.println((n-1-index)+(index-zeros));

        }
    }
}