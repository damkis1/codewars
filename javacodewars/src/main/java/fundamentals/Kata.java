package fundamentals;

import java.util.Arrays;

//Given a set of numbers, return the additive inverse of each.
// Each positive becomes negatives, and the negatives become positives.
public class Kata {
    public static int[] invert(int[] array) {
       return Arrays.stream(array).map(i -> -i).toArray();
    }
}
