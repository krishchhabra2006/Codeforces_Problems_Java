import java.util.*;
public class A_Desorting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []a =new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            long ans=Long.MAX_VALUE;

            if(isSorted(a)){
                for(int i=0;i<n-1;i++){
                    long diff=a[i+1]-a[i];
                    long ops=(diff/2)+1;
                    ans=Math.min(ops,ans);

                }
                System.out.println(ans);
            }
            else{
                System.out.println(0);
                
            }    
        }
    }
    public static boolean isSorted(int[]a){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]) return false;
            
        }
        return true;
    }

}