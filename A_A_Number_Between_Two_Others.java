import java.util.Scanner;
public class  A_A_Number_Between_Two_Others{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt())return;
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(b>2*a){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}