import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BDeleteAndConcatenate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        String line = reader.readLine();
        if (line == null)
            return;
        tokenizer = new StringTokenizer(line);

        int testCases = Integer.parseInt(tokenizer.nextToken());
        StringBuilder outputBuilder = new StringBuilder();

        while (testCases-- > 0) {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                line = reader.readLine();
                if (line == null)
                    break;
                tokenizer = new StringTokenizer(line);
            }

            int elementCount = Integer.parseInt(tokenizer.nextToken());
            long thresholdValue = Long.parseLong(tokenizer.nextToken());

            long[] elementsArray = new long[elementCount];
            for (int i = 0; i < elementCount; i++) {
                if (!tokenizer.hasMoreTokens()) {
                    line = reader.readLine();
                    tokenizer = new StringTokenizer(line);
                }
                elementsArray[i] = Long.parseLong(tokenizer.nextToken());
            }

            Arrays.sort(elementsArray);

            int leftPointer = 0;
            int rightPointer = elementCount - 1;
            long totalDifferenceSum = 0;

            while (leftPointer < rightPointer && elementsArray[leftPointer] < thresholdValue) {
                totalDifferenceSum += elementsArray[rightPointer] - thresholdValue;
                leftPointer++;
                rightPointer--;
            }

            while (leftPointer <= rightPointer) {
                totalDifferenceSum += elementsArray[leftPointer] - thresholdValue;
                leftPointer++;
            }

            outputBuilder.append(totalDifferenceSum).append("\n");
        }

        System.out.print(outputBuilder);
    }
}
