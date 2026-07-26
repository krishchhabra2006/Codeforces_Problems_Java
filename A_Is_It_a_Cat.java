import java.util.*;

public class A_Is_It_a_Cat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next().toLowerCase();

            // Check that all characters are valid
            boolean valid = true;
            for(char c : s.toCharArray()){
                if(c != 'm' && c != 'e' && c != 'o' && c != 'w'){
                    valid = false;
                    break;
                }
            }
            if(!valid){
                System.out.println("NO");
                continue;
            }
            // Compress consecutive characters
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            for(int i = 1; i < n; i++){
                if(s.charAt(i) != s.charAt(i-1)){
                    sb.append(s.charAt(i));
                }
            }
            // Check if compressed form is exactly "meow"
            if(sb.toString().equals("meow")){
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }
    }
}
