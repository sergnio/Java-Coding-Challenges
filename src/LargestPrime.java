public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(primeFactor(600851475143L));
    }



    private static long primeFactor(long n) {
        // take n, divide it by 2
        // is that == 0? if not, increment by 1
        // if that is == 0, return it
        int counter = 2;
        while (true) {
            if (n % counter == 0) {

            }
            counter++;
        }
    }

}
