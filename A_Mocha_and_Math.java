import java.util.Scanner;
public class A_Mocha_and_Math{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int ans=sc.nextInt();
                for(int i=1;i<n;i++){
                    ans&=sc.nextInt();
                    }
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
