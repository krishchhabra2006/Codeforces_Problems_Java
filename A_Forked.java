import java.util.*;
public class A_Forked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-->0){
                long a =sc.nextLong(); 
                long b =sc.nextLong();
                long xk =sc.nextLong(); 
                long yk =sc.nextLong();
                long xq =sc.nextLong(); 
                long yq =sc.nextLong();
                long[]dx={-1,1,-1,1};
                long[]dy={-1,-1,1,1};
                Set<String> king = new HashSet<>();
                Set<String> forks = new HashSet<>();
                for (int i=0;i<4;i++){
                    king.add((xk+dx[i]*a)+","+(yk+dy[i]*b));
                    king.add((xk+dx[i]*b)+","+(yk+dy[i]*a));
                }
                for(int i=0;i<4;i++){
                    String p1=((xq+dx[i]*a)+","+(yq+dy[i]*b));
                    String p2=((xq+dx[i]*b)+","+(yq+dy[i]*a)); 
                    if (king.contains(p1))forks.add(p1);
                    if (king.contains(p2))forks.add(p2);
                }
                System.out.println(forks.size());
            }
        }
    }
}
