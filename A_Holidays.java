import java.util.Scanner;
public class A_Holidays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt())return;
        int n=sc.nextInt();
        int holidays=(n/7)*2;
        int remdays=n%7;
        int min=holidays+(remdays==6?1:0);
        int max=holidays+Math.min(2,remdays);
        System.out.println(min+" "+max);
    }
}
