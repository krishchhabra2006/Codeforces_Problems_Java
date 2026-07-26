import java.util.*;
public class B_Sequence_Game{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []a=new int[n];
            for(int i=1;i<n;i++){
                a[i]=sc.nextInt();
            }
            int []b=new int[2*n];
            for(int i=1;i<n;i++){
                if(a[i]<a[i-1]){
                    System.out.print(a[i]);
                }
                System.out.print(a[i]);    
            }
        }
    }
}