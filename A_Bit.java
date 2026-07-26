import java.util.Scanner;
public class A_Bit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            if(s.charAt(1)=='+') X+=1;
            else X-=1;
        }
        System.out.println(X);

    }
}