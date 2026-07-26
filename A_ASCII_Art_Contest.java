import java.util.*;
public class A_ASCII_Art_Contest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())return;
        int g=sc.nextInt();
        int c=sc.nextInt();
        int l=sc.nextInt();
        int []a={g,c,l};
        Arrays.sort(a);
        if(a[2]-a[0]>=10) {
            System.out.println("check again");
        }
        else {
            System.out.println("final"+" "+a[1]);
        }
    }
}
