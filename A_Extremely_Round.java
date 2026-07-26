import java.util.*;
public class A_Extremely_Round{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int len=0;
            int temp=n;
            while(temp>0){
                temp/=10;
                len++;
            }
            if(len>0){
                int x=(int)Math.pow(10,len-1);
                int round=((9*(len-1))+(n/x));
                System.out.println(round);    
            }
            
        }
    }
}