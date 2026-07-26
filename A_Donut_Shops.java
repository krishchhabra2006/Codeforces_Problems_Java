import java.util.Scanner;

public class A_Donut_Shops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long res1=-1;
            long res2=-1;
            if(a<c) res1=1;
            if(a*b>c) res2=b;
            System.out.println(res1+" "+res2);
        }
    }
}