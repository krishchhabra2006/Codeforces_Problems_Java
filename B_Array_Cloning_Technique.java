import java.util.*;

public class B_Array_Cloning_Technique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return ;
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long []a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            int max_freq=0;
            int count=1; 
            Arrays.sort(a);
            for(int i=1;i<n;i++){
                if(a[i]==a[i-1]){
                    count++;
                }
                else {
                    max_freq=Math.max(max_freq,count);
                    count=1;
                }
            }
            max_freq=Math.max(max_freq,count);
            int ans=0;
            int temp=max_freq;
            while(temp<n){
                ans++;
                int rem=n-temp;
                int swap=Math.min(temp,rem);
                ans+=swap;
                temp+=swap;
            }
            System.out.println(ans);   
        }
    }
}