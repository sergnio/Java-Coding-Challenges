public class EvenFibo {

    public static void main(String[] args) {
//        System.out.println(evenFib(0,1));
        System.out.println(betterFib(4000000));
        fibo(100);


    }

    private static void fibo(int n) {
        long[] a = new long[n];

        a[0] = 0;
        a[1] = 1;

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 2] + a[i - 1];
            System.out.println(a[i]);
        }

        // a+b
    }


    private static int betterFib(int n) {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n + 2]; // 1 extra to handle case, n = 0
        int i;
        int evenSum = 0;

        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
       /* Add the previous 2 numbers in the series
         and store it */
            f[i] = f[i - 1] + f[i - 2];
            if (f[i] % 2 == 0) {
                evenSum = f[i];
            }
        }

        return evenSum;

    }

    private static long evenFib(long firstDigit, long secondDigit) {
        long[][] firstTracker;
        long[][] secondTracker;

        long sum;
        long evenSum = 0;

        while (secondDigit < 4000000) {
            if (firstDigit == 0) {
                sum = secondDigit;
            } else {
                sum = firstDigit + secondDigit;
            }

            if (sum % 2 == 0) {
                evenSum += sum;
            }
            firstDigit = secondDigit;
            secondDigit = sum;
            evenFib(firstDigit, secondDigit);
        }
        return evenSum;
    }
}
