public class SummationPrimes {
    public static void main(String[] args) {
        System.out.println(findPrime(2000000));
    }

    private static long     findPrime(int x) {
        // the number we're currently at
        int iterator = 1;
        // how many prime numbers we hit
        long primeCounter = 0;

        // if this number is anything other than 10,001, continue
        while (iterator < x) {
            iterator++;
            if (isPrime(iterator)) {
                primeCounter+= iterator;
            }
        }
        return primeCounter;
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
