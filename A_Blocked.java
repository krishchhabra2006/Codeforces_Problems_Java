import java.util.*;
public class A_Blocked{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())return;
        int t=sc.nextInt();
        while(t-->0){
             int n=sc.nextInt();
        int[]a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        Set<Integer> s=new HashSet<>();
        for(int x:a){
            s.add(x);
        }
        if(s.size()<n) {
            System.out.print(-1);
        }
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--){
            if(s.size()==n) System.out.print(a[i]+" ");
        }
        System.out.println();
        }
    }
}
