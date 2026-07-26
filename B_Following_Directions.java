import java.util.*;

public class B_Following_Directions{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int x=0,y=0 ;
            boolean flag=false;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='U') y++;
                else if(s.charAt(i)=='L') x--;
                else if(s.charAt(i)=='D') y--;
                else x++;
            
                if(x==1 && y==1) flag=true;
            }
            System.out.println(flag ? "YES":"NO");
    
        }
    }
}