import java.util.*;

public class A_Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < s.length(); ) {
            if (i <= s.length() - 3 && s.substring(i, i + 3).equals("WUB")) {
                res.append(" ");
                i += 3;
            } else {
                res.append(s.charAt(i));
                i++;
            }
        }
        
        String ans = res.toString().trim().replaceAll("\\s+", " ");
        System.out.println(ans);
    }
}
