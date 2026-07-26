import java.util.*;
public class A_Add_and_Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return ;
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            int ans=Integer.MAX_VALUE;
            for(int k=0;k<=30;k++){
               long newb=b+k;
               if(newb==1) continue;
               long tempA=a;
               int op=k;
               while(tempA>0){
                tempA/=newb;
                op++;
               }
               ans=Math.min(ans,op);

            }
            System.out.println(ans);
        }
    }
}