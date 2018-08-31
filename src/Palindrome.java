public class Palindrome {
    public static void main(String[] args) {
        System.out.println(lp());
    }

    public static boolean isPalindrome(int n) {
        char[] chars = ("" + n).toCharArray();
        int length = chars.length;
        int decrease;
        int increase;
        // 3 / 2 = 1.5
        // d = 1
        // i = 2
        // 4 / 2 = 2

        if (length % 2 == 1) {
            decrease = (int) Math.floor(length / 2);
            increase = (int) Math.ceil(length / 2);
        } else {
            decrease = (length / 2) - 1;
            increase = (length / 2);
        }

        while (decrease >= 0) {
            if (chars[decrease] != chars[increase]) {
                return false;
            }
            decrease--;
            increase++;
        }
        return true;
        // odd case
        // even case

    }


    public static int lp() {
        int digit1 = 999;
        int digit2 = 999;
        int largest = 0;

        for (int i = digit1; i > 0; i--) {
            for (int x = digit2; x > 0; x--) {
                int product = i * x;
                if (product > largest && isPalindrome(product)) {
                    largest = product;
                }
            }
        }

        return largest;
    }

}

