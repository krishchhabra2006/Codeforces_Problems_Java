import java.util.*;
public class C_Word_on_the_Paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char[][] grid = new char[8][8];
            for (int i = 0; i < 8; i++) {
                grid[i] = sc.next().toCharArray();
            }
            for (int c = 0; c < 8; c++) {
                StringBuilder sb = new StringBuilder();
                for (int r = 0; r < 8; r++) {
                    if (grid[r][c] != '.') {
                        sb.append(grid[r][c]);
                    }
                }
                if (sb.length() > 0) {
                    System.out.println(sb.toString());
                    break;
                }
            }
        }
    }
}