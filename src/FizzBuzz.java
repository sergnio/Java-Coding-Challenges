import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(FizzBuzz(2, 2, 4));
    }


    private static Set<Seat> FizzBuzz(int rows, int seatsInRow, int firstRowNumber) {
        final char[] rowLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        Set rowSet = new HashSet();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsInRow; j++) {
                Seat seat = new Seat(Integer.toString(firstRowNumber) + rowLetter[j]);

                rowSet.add(seat.getNumber());
                System.out.println(seat.getNumber());
            }
            // since java is pass by method value, we can increment here
            firstRowNumber++;
        }
        return new TreeSet<>(rowSet); // TODO: Implement
    }
}
