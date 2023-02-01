package fundamentals;

import java.util.Arrays;

//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//
//For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//Note: The function accepts an integer and returns an integer
public class SquareDigit {
    public int squareDigits(int n) {
        String reduce = Arrays.stream(String.valueOf(n).split(""))
                .map(s -> Integer.parseInt(s) * Integer.parseInt(s))
                .map(String::valueOf)
                .reduce("", (result, next) -> result + next + "");

        return Integer.parseInt(reduce);
    }

}
