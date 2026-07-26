import java.util.Scanner;

public class B_Tab_Closing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            if(b>=a){
                System.out.println(1);
                continue;
            }
            int x=a/b;
            if(n<=x){
                System.out.println(1);
            }
            else System.out.println(2);  
        }
    }
}