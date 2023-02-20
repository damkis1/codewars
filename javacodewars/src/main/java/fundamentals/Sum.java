package fundamentals;

import java.util.stream.IntStream;

//Given two integers a and b, which can be positive or negative,
// find the sum of all the integers between and including them and return it.
// If the two numbers are equal return a or b.
//
//Note: a and b are not ordered!
//
//Examples (a, b) --> output (explanation)
public class Sum {
    public static int getSum(int a, int b) {
        if (a == b) return a;
        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
    }
}
