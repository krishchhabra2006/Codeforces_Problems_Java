import java.util.*;
public class A_One_and_Two{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int Two=0;
            for(int x :a){
                if(x==2) Two++;    
            }
            if(Two%2==1) {
                System.out.println(-1);
                continue;
            }
            if(Two==0){
                System.out.println(1);
                continue;
            }
            int split=Two/2;
            int current=0;
            int answer=-1;

            for(int i=0;i<n;i++){
                if(a[i]==2) current++;
                if(split==current){
                    answer=i+1;
                    break;

                }
            }
            System.out.println(answer);
        }
        
    }

}