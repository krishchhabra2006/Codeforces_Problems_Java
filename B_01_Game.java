import java.util.Scanner;

public class B_01_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=0;
            int m=0;

            String s=sc.next();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0') n++;
                else m++;
            }
            int min=Math.min(n,m);
            if(min%2==1) System.out.println("DA");
            else System.out.println("NET");
        }
    }
}