import java.util.Scanner;
public class B_Alternating_String{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt())return;
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int pair=0;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    pair++;
                    
                }
            }
            if(pair<=2) System.out.println("YES");
            else System.out.println("NO");   
        }
    }
}