import java.util.Scanner;

public class B_Luntik_and_Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long count1=0;
            long count0=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a==1) count1++;
                else if(a==0) count0++;
            }
            long res=count1*(long)Math.pow( 2,count0);
            System.out.println(res);
        }
    }
}