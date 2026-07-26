import java.util.*;

public class A_Forbidden_Integer {
    static void printArray(int count,int val){
        for(int i=0;i<count;i++){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            if(x!=1){
                System.out.println("YES");
                System.out.println(n);
                printArray(n,1);
            }
            else{
                if(k==1 || (k==2 && n%2!=0))System.out.println("NO");
                else {
                    System.out.println("YES");
                    if(n%2==0){
                        System.out.println(n/2);
                        printArray(n/2, 2);
                    }
                    else {
                        int countOfTwos = (n - 3) / 2;
                        System.out.println(countOfTwos + 1); 
                        System.out.print("3 ");
                        printArray(countOfTwos, 2);
                        
                    }
                } 
            }   
        }
    }
}