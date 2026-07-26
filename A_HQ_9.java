import java.util.*;

public class A_HQ_9{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean check=false;
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='H' || s.charAt(i)=='Q'|| s.charAt(i)=='9') {
                check=true;
                break;
            }
        }
        if(check)System.out.println("YES");
        else System.out.println("NO");
    }
}