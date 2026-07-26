import java.util.*;

public class C_Showering{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int m=sc.nextInt();
            boolean shower=false;
            int last=0;
            for(int i=0;i<n;i++){
                int l=sc.nextInt();
                int r=sc.nextInt(); 
                if(l-last>=s) {
                    shower=true;
                }
                last=r;
            }
            if(m-last>=s) shower=true;
            System.out.println(shower? 
        "YES":"NO");

        }
    }
}