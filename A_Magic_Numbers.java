import java.util.*;

public class A_Magic_Numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int i=0;
            for(i=0;i<s.length();i++){
            if(i+2<s.length()&&s.charAt(i)=='1' && s.charAt(i+1)=='4' && s.charAt(i+2)=='4') i+=2;
            else if( i+1<s.length()&& s.charAt(i)=='1' && s.charAt(i+1)=='4') i+=1;
            else if( i<s.length()&& s.charAt(i)=='1') continue;
            else{
               System.out.println("NO"); 
               break;
            }
        }
        if(i==s.length())  System.out.println("YES");
    }
}
