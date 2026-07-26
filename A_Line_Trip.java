import java.util.*;

public class A_Line_Trip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); 
		while (t-- > 0) {
			long n = sc.nextLong(); 
			long x = sc.nextLong(); 
			List<Long> pointsList = new ArrayList<>();
			pointsList.add(0L); 

			
			for (int i = 0; i < n; i++) {
				long point = sc.nextLong(); 
				pointsList.add(point);
			}

			pointsList.add(x); 
			n = pointsList.size(); 
			long maxDis = Long.MIN_VALUE; 
			for (int i = 1; i < n; i++) {
				if (i == n - 1) {
					
					maxDis = Math.max(maxDis, 2 * (pointsList.get(i) - pointsList.get(i - 1)));
				} else {
					
					maxDis = Math.max(maxDis, pointsList.get(i) - pointsList.get(i - 1));
				}
			}
			System.out.println(maxDis);
		}
		sc.close();
	}
}
