import java.util.*;
public class A_Alice_and_Bob{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int a=sc.nextInt();
                int[] ar = new int[n]; 
                for(int i=0;i<n;i++) ar[i]=sc.nextInt();
                Arrays.sort(ar);
                int l=0,r=0;

                for(int i=0;i<n;i++){
                    if(ar[i]>=a) l++;
                    else r++;
                }
                if(l>r) System.out.println(a+1);
                else System.out.println(a-1);
            }
        }
    }
}
            