import java.util.*;

public class B_Comparison_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int min_cost=1;
            int count=1;
            int n=sc.nextInt();
            String s=sc.next();
            for(int i=1;i<n;i++){
                if(s.charAt(i)!=s.charAt(i-1)){
                    count=1;
                }
                else count++;
                min_cost=Math.max(min_cost,count);
            }
            System.out.println(min_cost+1);
        }
    }
}