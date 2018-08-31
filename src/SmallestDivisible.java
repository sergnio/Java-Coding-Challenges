public class SmallestDivisible {

    public static void main(String[] args) {
        // don't have to worry about negatives
        // have to divide a number by 1,2,3,4,...,20
            // which means, n % x == 0
        // naive.. start from 1, go until they're all divisible
        // lets do it

        System.out.println(divisible());
    }

    // never finished
    private static void divisible2() {
        int counter = 21;
        //2^4,3^2,,5,7,11,13,15,17,19
        while (true) {

        }
    }


    private static int divisible() {
        int counter = 20;
        while (true) {
            for (int i = 1; i <= 20; i++) {
                if (i != 20) {
                    if (counter % i != 0) {
                        break;
                    }
                } else {
                    if (counter % i == 0) {
                        return counter;
                    }
                }
            }
            counter++;
        }
    }

}
