import java.util.Scanner;

public class Erase {
    public static void main(final String[] args) {
        try (final Scanner in = new Scanner(System.in)) {
            final int count = in.nextInt() % 2;
            final String initial = in.next();
            final String done = in.next();
            final String expected = getExpected(count, initial);
            System.out.println((expected.equals(done)) ? "Deletion succeeded" : "Deletion failed");
        }
    }

    private static String getExpected(final int count, final String initial) {
        if (count == 0) {
            return initial;
        }

        return initial
                   .replace('0', 'a')
                   .replace('1', 'b')
                   .replace('a', '1')
                   .replace('b', '0');
    }
}
