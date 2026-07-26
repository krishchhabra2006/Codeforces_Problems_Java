import java.util.Scanner;
public class A_Letter{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        String[]grid=new String[n];
        int minR=n,maxR=-1,minC=m,maxC=-1;
        for(int i=0;i<n;i++){
            grid[i]=sc.nextLine();
            for(int j=0;j<m;j++){
            if(grid[i].charAt(j)=='*'){
                if(i<minR)minR=i;
                if(i>maxR)maxR=i;
                if(j<minC)minC=j;
                if(j>maxC)maxC=j;
                }
            }
        }
        for(int i=minR;i<=maxR;i++){
            System.out.println(grid[i].substring(minC,maxC+1));
        }
        sc.close();
    }
}
