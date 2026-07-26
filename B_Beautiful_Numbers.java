import java.util.*;

public class B_Beautiful_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int testCases = sc.nextInt();
            while (testCases-- > 0) {
                solve(sc);
            }
        }
    }
    public static void solve(Scanner sc) {
        String numStr = sc.next();
        int len = numStr.length();
        int currentSum = 0;
        List<int[]> digitPairs = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            int digit = numStr.charAt(i) - '0';
            currentSum += digit;
            digitPairs.add(new int[]{digit, i});
        }
        Collections.sort(digitPairs, (a, b) -> Integer.compare(a[0], b[0]));
        int operations = 0;
        int targetSum = currentSum;
        int pointer = len - 1;
        while (targetSum >= 10 && pointer >= 0) {
            int digitValue = digitPairs.get(pointer)[0];
            int originalIdx = digitPairs.get(pointer)[1];
            if (originalIdx == 0) {
                targetSum -= (digitValue - 1);
            } else {
                targetSum -= digitValue;
            }
            operations++;
            pointer--;
        }
        System.out.println(operations);
    }
}