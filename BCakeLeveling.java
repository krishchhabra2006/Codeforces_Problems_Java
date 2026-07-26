import java.util.Scanner;

public class BCakeLeveling{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        StringBuilder sb =new StringBuilder();
        while(t-->0){
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            long sum=0;
            long total=Long.MAX_VALUE;
            for (int i=0;i<n;i++){
                sum+=a[i];
                long Avg=sum/(i+1);
                if(Avg<total){
                    total=Avg;
                }
                sb.append(total).append(i==n-1?"":" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        sc.close();
    }
}
