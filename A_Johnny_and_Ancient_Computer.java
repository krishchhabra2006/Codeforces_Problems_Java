import java.util.Scanner;
public class A_Johnny_and_Ancient_Computer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt())return;
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==b){
                System.out.println(0);
                continue;
            }
            long low=Math.min(a,b);
            long high=Math.max(a,b);
            if(high%low!=0){
                System.out.println(-1);
                continue;
            }
            long diff=high/low;
            if((diff&(diff-1))!=0){
                System.out.println(-1);
                continue;
            }
            int k=0;
            while(diff>1){
                diff>>=1;
                k++;
            }
            int ops=0;
            ops+=k/3;
            k%=3;
            ops+=k/2;
            k%=2;
            ops+=k;
            System.out.println(ops
            );
        }
    sc.close();
    }
}
