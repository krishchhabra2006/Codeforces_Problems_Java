
import java.util.*;
public class BAnotherSortingProblem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []a=new int[n];
            int []sort=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sort[i]=a[i];
            }
            int count=0;
            Arrays.sort(sort);
            for(int i=0;i<n;i++){
                if(a[i]!=sort[i]) count++;
            }
            if(count>=3) System.out.println("NO");
            else System.out.println("YES");
            

               
        }
    }
}
