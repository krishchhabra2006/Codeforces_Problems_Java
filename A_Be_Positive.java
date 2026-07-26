import java.util.*;
public class A_Be_Positive{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();

            }
            int neg=0;
            int zero=0;
            for(int x:a){
                if(x==-1) neg++;
                else if(x==0) zero++; 
            }
            int ans;
            if(neg%2==0){
                ans=zero;
            }
            else{
                ans=zero+2;
            }
            System.out.println(ans);   
        }

    }
    
}