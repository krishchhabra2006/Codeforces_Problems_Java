import java.util.*;
public class B_Olya_and_Game_with_Arrays{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t =s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            long sum=0;
            int g1=Integer.MAX_VALUE;
            int g2=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int m=s.nextInt();
                int m1 =Integer.MAX_VALUE; 
                int m2 =Integer.MAX_VALUE;
                for(int j=0;j<m;j++){
                    int v=s.nextInt();
                    if(v<m1){
                        m2=m1; 
                        m1=v; 
                    }
                    else if(v<m2)m2=v;
                }
                sum+=m2;
                g1=Math.min(g1,m1);
                g2=Math.min(g2,m2);
            }
            System.out.println(sum-g2+g1);
        }
    }
}
