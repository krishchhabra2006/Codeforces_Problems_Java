import java.util.*;
public class A_Raising_Bacteria{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int n = sc.nextInt();
            int count=0;
            while(n>0){
                if((n&1)==1){
                    count++;
                }
                n=n>>1;
            }
            System.out.println(count);   
        }
    }
}
