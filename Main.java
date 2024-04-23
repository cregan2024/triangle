import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int lineNumber = 14; // Change this to the desired line number
        int[] line = pascalsTriangleLine(lineNumber);
        System.out.println("Line " + lineNumber + " of Pascal's Triangle: " + Arrays.toString(line));
    }

    public static int[] pascalsTriangleLine(int n) {
        if (n == 1) {
            return new int[]{1};
        } else {
            int[] prevLine = pascalsTriangleLine(n - 1);
            int[] currentLine = new int[n];
            currentLine[0] = 1;
            currentLine[n - 1] = 1;
            calculateLine(prevLine, currentLine, n, 1);
            return currentLine;
        }
    }

    private static void calculateLine(int[] prevLine, int[] currentLine, int n, int index) {
        if (index < n - 1) {
            currentLine[index] = prevLine[index - 1] + prevLine[index];
            calculateLine(prevLine, currentLine, n, index + 1);
        }
    }
}
