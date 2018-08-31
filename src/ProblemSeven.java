public class ProblemSeven {
    // 10,001st prime
    public static void main(String[] args) {
        System.out.println(findPrime());
    }

    private static int findPrime() {
        // the number we're currently at
        int iterator = 0;
        // how many prime numbers we hit
        int primeCounter = 0;

        // if this number is anything other than 10,001, continue
        while (primeCounter <= 10001) {
            iterator++;
            if (isPrime(iterator)) {
                primeCounter++;
            }
        }
        return iterator;
    }

    private static boolean isPrime(int i) {
        // take the sqrt of our input, and round down.
        // this eliminates any duplicate checks (16,8,4,2)
//        int div2 = Math.floorDiv(i, 2);
        double div2 = Math.floor(Math.sqrt(i));
        // go until you hit 2
        for (double x = div2; x > 1; x--) {
            if (i % x == 0) {
                // if our number is divisible by our sqrt, it's not prime
                return false;
            }
        }

        return true;
    }
}
