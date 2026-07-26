import java.io.*; 
import java.util.*;
public class C_Grid_Covering {
    public static long gcd(long a,long b){
        while(b!=0){
            a%=b;
            long t=a;
            a=b;
            b=t;
        }
        return a;
    }
    public static void main(String[]args)throws IOException{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter w=new PrintWriter(System.out);
        String l=r.readLine();
        if(l==null)return;
        int t=Integer.parseInt(l.trim());
        while(t-->0){
            StringTokenizer s=new StringTokenizer(r.readLine());
            long n=Long.parseLong(s.nextToken());
            long m=Long.parseLong(s.nextToken());
            long a=Long.parseLong(s.nextToken());
            long b=Long.parseLong(s.nextToken());
            if(gcd(a,n)==1&&gcd(b,m)==1&&gcd(n,m)<=2)w.println("YES");
            else w.println("NO");
        }
        w.flush();
    }
}
