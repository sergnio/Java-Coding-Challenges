public class SumSquareDiff {
    public static void main(String[] args) {
        // iterate thru, 1 - 100
        // take square root of n, add it to sum
        // in other news..
        // do factorial of 100
        // square that
        // first sum - second sum



        int sumSquare = (int) sumSquare(100);
        int squareSum = (int) squareSum(100);
        System.out.printf("sumSquare %d, squareSum %d\n\n", sumSquare, squareSum);
        System.out.println(squareSum - sumSquare);
    }

    private static double squareSum(int i) {
        int sum = 0;

        for (int x = 1; x <= i; x++) {
            sum += x;
        }

//            return sum * sum;
            return Math.pow(sum, 2) ;
    }

    private static double sumSquare(int i) {
        double sum = 0;

        for (int x = 1; x <= i; x++) {
//            sum = x * x;
            sum += Math.pow(x,2);
        }

        return sum;
    }
}
