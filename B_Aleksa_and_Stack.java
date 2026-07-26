import java.util.*;

public class B_Aleksa_and_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int []a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=3*i+1;  
            }
            for(int x:a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}