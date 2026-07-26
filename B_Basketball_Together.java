import java.util.*;
public class B_Basketball_Together{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt())
            return;
        int n =s.nextInt();
        int d=s.nextInt();
        int []a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();   
        }
        Arrays.sort(a);
        int left=-1;
        int right=n-1;
        int i=1;
        int teams=0;
        while(left<right){
            if(a[right]*i<=d){
                left++;
                i++;
            }
            else{
                teams++;
                i=1;
                right--;
            }

        }
        System.out.println(teams);   
    }
}