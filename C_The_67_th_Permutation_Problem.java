import java.util.Scanner;
public class  C_The_67_th_Permutation_Problem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t=sc.nextInt();
            while(t-->0){
                int n =sc.nextInt();
                int low=1;
                int high=3*n;
                for (int i =0;i<n;i++){
                    int c =high--;
                    int b =high--;
                    int a =low++;
                    System.out.println(a+" "+b+" "+c+(i== n-1?"" :" "));
                }
                System.out.println();
            }
        }
    }
}
