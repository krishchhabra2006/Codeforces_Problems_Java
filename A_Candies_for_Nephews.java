import java.util.Scanner;

public class A_Candies_for_Nephews{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); 
		while (t-- > 0) { 
			long n = scanner.nextLong(); 
            if(n%3==1) System.out.println(2);
            else if (n%3==2) System.out.println(1);
            else System.out.println(0);
        }
    }
}    
