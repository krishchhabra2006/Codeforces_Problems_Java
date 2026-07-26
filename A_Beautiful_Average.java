import java.util.*;
public class A_Beautiful_Average{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []a=new int[n];
            int maxi=a[0];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                
            }
            for(int i=0;i<n;i++){
                if(a[i]>maxi){
                    maxi=a[i];
                }
            }
            System.out.println(maxi);
            
            
        }
    }
}