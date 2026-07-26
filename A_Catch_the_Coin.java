import java.util.*;

public class A_Catch_the_Coin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(m<-1){
                System.out.println("NO");

            }
            else System.out.println("YES");
        }
    }
}
