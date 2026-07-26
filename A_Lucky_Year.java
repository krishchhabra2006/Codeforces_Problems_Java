import java.util.*;
public class A_Lucky_Year{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long answer=Long.MAX_VALUE;
        for(int power=0;power<=9;power++){
            long base=1;
            for(int i=0;i<power;i++) base*=10;
            for(int j=0;j<=9;j++){
                long lucky=j*base;
                if(lucky>n){
                    answer=Math.min(answer,lucky-n);
                }
            }
        }
        System.out.println(answer);    
    }       
}