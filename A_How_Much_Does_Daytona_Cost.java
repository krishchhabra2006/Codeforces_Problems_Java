import java.util.Scanner;

public class A_How_Much_Does_Daytona_Cost {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            boolean found=false;
            int n=sc.nextInt();
            int k=sc.nextInt();
            for(int i=0;i<n;i++){
                if(sc.nextInt()==k){
                    found=true;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }
    }  
}
