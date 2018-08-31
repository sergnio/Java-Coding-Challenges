import java.util.ArrayList;
import java.util.List;

public class ProblemTwelve {
    public static void main(String[] args) {
        System.out.println(divisibleTriangle(5));
    }

    private static long divisibleTriangle(int i) {
        List<Long> triangleNumbers = new ArrayList<>();
        long newTriangleNumber = 0;
                int divisors = 1,
                incrementor = 2;

        triangleNumbers.add(1L);

        while (divisors < i-1) {
            newTriangleNumber = triangleNumbers.get(incrementor - 2) + incrementor;
            triangleNumbers.add(newTriangleNumber);
            System.out.println(incrementor);
            incrementor++;

            divisors = countDivisors(newTriangleNumber);
        }

        return newTriangleNumber;
    }

    private static int countDivisors(long triangleNumber) {
        int highestCommonDivisor = (int) Math.ceil(Math.sqrt(triangleNumber));
        int divisors = 0;

        for (int i = highestCommonDivisor; i > 0; i--) {
            if (triangleNumber % i == 0) {
                divisors++;
            }
        }
        System.out.println("divisors: " +divisors + " for tn: " + triangleNumber);
        return divisors;
    }
}
