import java.util.Scanner;
public class B_Make_It_Increasing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                long []a=new long[n];
                for(int i=0;i<n;i++) a[i]=sc.nextLong();
                boolean flag=true;
                int op=0;
                for(int i=n-2;i>=0;i--){
                    if(a[i+1]==0) {
                        flag=false ;
                        break;
                    }
                    while(a[i]>=a[i+1]){
                        a[i]/=2;
                        op++;
                    }
                }
                if(flag) System.out.println(op);
                else System.out.println(-1);
            }
        }
    }
}
