import java.util.*;
public class B_Make_AP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            boolean flag=false;
            long x=(2*b)-c;
            if(x>0 && x%a==0){
                flag=true;
            }
            long y=a+c;
            if (y%(2*b)==0 && y>0){
                flag=true;

            }
            long z=(2*b)-a;
            if( z%c==0 &&z>0){
                flag=true;
            }
            System.out.println(flag ?"YES":"NO");   
        }
    }
}