import java.util.Scanner;

public class BClockwork {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int flag=0;
            for(int i=0;i<n;i++){
                Long x=sc.nextLong();
                if(x<=2*i || x<=(n-i-1)*2) flag=1;

            }
            if(flag==1) System.out.println("NO");
            else System.out.println("YES");

        }
    }
}