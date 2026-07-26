import java.util.*;
public class A_DBMB_and_the_Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextInt();
        while(t-->0){
            long n=sc.nextInt();
            long s=sc.nextInt();
            long x=sc.nextInt();
            long sum=0;
            for(int i=0;i<n;i++){
                sum+=sc.nextInt();

            }
            if(s>=sum && (s-sum)%x==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}