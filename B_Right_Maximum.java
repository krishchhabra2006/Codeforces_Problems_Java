import java.util.*;

public class B_Right_Maximum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int maxi=0;
            
            int count=0;

            int n=sc.nextInt();
            int []a=new int [n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(a[i]>=maxi){
                    count++;
                    maxi=a[i];
                }
            }
            System.out.println(count);
        }
    }
}
