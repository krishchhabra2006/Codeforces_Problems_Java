import java.util.Scanner;

public class A_It_s_Time_To_Duel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int count=0;
            int n=sc.nextInt();
            int []a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==1) count++;
            }
            boolean lie=false;
            for(int i=0;i<n-1;i++){
                if(a[i]==0 && a[i+1]==0){
                    lie=true;
                    break;
                }
            }
            if(count>n-1) lie=true;
            System.out.println(lie? "YES":"NO");
        }
    }
}