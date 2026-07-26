import java.util.*;
public class  B_Bad_Boy{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t =s.nextInt();
        while(t-->0){
            long n=s.nextLong();
            long m=s.nextLong();
            long i=s.nextLong();
            long j=s.nextLong();
            System.out.println("1 1"+" "+n+" "+m);
        }
    }
}