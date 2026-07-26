import java.util.*;

public class A_Carnival_Wheel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int l=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(b==1 && a==0){
                System.out.println(l-1);
                continue;
            }
            int maxi=0;
            for(int i=0;i<l;i++){
                maxi=Math.max((a+i*b)%l,maxi);    
            }
            System.out.println(maxi);
        }
    }
}
