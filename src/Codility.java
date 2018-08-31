import java.util.Arrays;

public class Codility {

    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//    This is a demo task.
//
//    Write a function:
//
//    class Solution { public int solution(int[] A); }
//
//    that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//    Given A = [1, 2, 3], the function should return 4.
//
//    Given A = [−1, −3], the function should return 1.
//
//    Assume that:
//
//    N is an integer within the range [1..100,000];
//    each element of array A is an integer within the range [−1,000,000..1,000,000].
//    Complexity:
//
//    expected worst-case time complexity is O(N);
//    expected worst-case space complexity is O(N) (not counting the storage required for input arguments).


    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(solution(A));
        System.out.println("should be 4");
        int[] B = {-2, -3};
        System.out.println(solution(B));
        System.out.println("should be -1");
        int[] C = {-1, 2, 3};
        System.out.println(solution(C));
        System.out.println("should be 1");
        int[] D = {1, -2, 3};
        System.out.println(solution(D));
        System.out.println("should be 2");
        int[] E = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(E));
        System.out.println("should be 5");
        int[] F = {-1, -3};
        System.out.println(solution(F));
        System.out.println("should be 1");
        int[] G = {-6, -5, -4, -2};
        System.out.println(solution(G));
        System.out.println("should be 1");

    }


    private static int solution(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        int lastElement = array[length - 1];

        // start at beginning
        // iterate until a number is greater than 0
        // if 1, return 1
        // else, if next index is not equal to index + 1, return index + 1
        // otherwise, continue until it is

        Integer x = checkAllNegative(lastElement);
        if (x != null) return x;

        for (int i = 0; i < length - 1; i++) {
            if (array[i + 1] == array[i]) {
                continue;
            }
            if (array[i] > 0 && array[i + 1] != array[i] + 1) {
                return array[i] + 1;
            }

        }
        return lastElement + 1;
    }

    private static Integer checkAllNegative(int lastElement) {
        if ((lastElement == -1 || lastElement == 0) || lastElement < 0) {
            return 1;
        }
        return null;
    }
}
