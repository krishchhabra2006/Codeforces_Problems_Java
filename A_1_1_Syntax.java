import java.io.*;
import java.util.*;

public class Main {
    
    // 1. Initialize the global reader and writer
    static FastScanner in = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        
        // --- YOUR CODE GOES HERE ---
        // Example Usage:
        int n = in.nextInt();           // Read an integer
        long k = in.nextLong();         // Read a long
        String word = in.next();        // Read a single word (stops at space)
        String line = in.nextLine();    // Read an entire line of text
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();      // Read array elements incredibly fast
        }

        out.println("YES");             // Print a string
        out.print(n + " ");             // Print without a newline
        // ---------------------------

        // 2. CRITICAL: You MUST flush the output at the very end of main
        out.flush();
    }

    // 3. Keep this utility class at the bottom of your file
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null; // Handle End of File
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        
        String nextLine() {
            String str = "";
            try {
                if (st != null && st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}