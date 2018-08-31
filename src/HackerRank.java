import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HackerRank {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(isAnagram("Hello","hello"));;
//        nextLine();
//        ifElse();
//        welcomeToJava();
//        inAndOut();
    }

    private static boolean isAnagram(String a, String b) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> compareMap = new HashMap<>();

        mapCharacters(a, map);
        mapCharacters(b, compareMap);

        return map.equals(compareMap);

    }

    private static void mapCharacters(String a, Map<Character, Integer> map) {
        for (char c : a.toCharArray()) {
            Character lc = Character.toLowerCase(c);
            if (map.containsKey(lc)) {
                map.put(lc, map.get(lc) + 1);
            } else {
                map.put(lc, 1);
            }
        }
    }

    private static void nextLine() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    private static void ifElse() {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (n < 1 || n > 100) {
            System.out.println("invalid, less than 1 or greater than 100");
        } else if (n % 2 == 1) {
            System.out.println("Weird");
        } else if (isEven(n) & n>=2 & n<=5) {
            System.out.println("Not Weird");
        } else if (isEven(n) & n >= 6 & n <= 20) {
            System.out.println("Weird");
        } else if (isEven(n) & n>20) {
            System.out.println("Not Weird");
        }

        scanner.close();

    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Problem 3

    // Problem 2
    private static void inAndOut() {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            System.out.println(scanner.nextInt());
        }
        scanner.close();
    }

    // Problem 1
    private static void welcomeToJava() {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}
