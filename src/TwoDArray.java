import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TwoDArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        ArrayList totals = new ArrayList();

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (isHourglass(arr, i, j)) {
                    totals.add(getHourglassSum(arr, i, j));
                }
            }
        }

        return (int) Collections.max(totals);
    }

    private static int getHourglassSum(int[][] arr, int i, int j) {
        return arr[i][j] + arr[i + 1][j] + arr[i + 2][j]
                + arr[i + 1][j + 1] + arr[i][j + 2]
                + arr[i + 1][j + 2] + arr[i + 2][j + 2];
    }

    private static boolean isHourglass(int[][] arr, int i, int j) {
        return arr[i][j] != 0 && arr[i + 1][j] != 0 && arr[i + 2][j] != 0
                && arr[i + 1][j + 1] != 0 && arr[i][j + 2] != 0
                && arr[i + 1][j + 2] != 0 && arr[i + 2][j + 2] != 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);

        scanner.close();
    }
}
