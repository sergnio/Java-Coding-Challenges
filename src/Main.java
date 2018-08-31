public class Main {

    public static void main(String[] args) {
        System.out.println(factors(10));
    }

    private static int factors(int naturalNumber) {
        int counter = 0;
        int sum = 0;

        while (counter < naturalNumber) {
            if (counter % 3 == 0 || naturalNumber % 5 == 0) {
                sum += counter;
            }
            counter++;
        }

        return sum;
    }
}
