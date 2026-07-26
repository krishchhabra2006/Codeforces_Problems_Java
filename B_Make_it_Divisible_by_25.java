import java.util.Scanner;
public class B_Make_it_Divisible_by_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())return;
        int t =sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int ans = s.length();
            ans=Math.min(ans,solve(s,"00"));
            ans=Math.min(ans,solve(s,"25"));
            ans=Math.min(ans,solve(s,"50"));
            ans=Math.min(ans,solve(s,"75"));
            System.out.println(ans);
        }
    }
    public static int solve(String s,String target){
        int n=s.length();
        int steps=0;
        int Idx=1;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==target.charAt(Idx)){
                Idx--;
                if (Idx<0)return steps;
            } 
            else{
                steps++;
            }
        }
        return n;
    }
}
