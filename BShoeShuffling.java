import java.util.Scanner;
public class BShoeShuffling{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- >0){
            long n=s.nextLong();
            int a=s.nextInt();
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();

            }
            for(int i=0;i<n;i++){
                if(a[i]==a[i+1] && i < n-1){
                    


                }
            }

        }
    }
    
}