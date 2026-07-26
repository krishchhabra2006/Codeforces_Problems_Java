
import java.util.Scanner;
public class B_The_67_th_6_7_Integer_Problem {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int []a=new int[7];
            long sum=0;
            long max=-100;
            for(int i=0;i<7;i++) {
                    a[i]=sc.nextInt();
                    sum+=a[i];
                    if (a[i]>max){
                        max=a[i];
                    }
            }
            System.out.println(2L*max-sum);
            
        }
    }
}