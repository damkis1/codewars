package fundamentals;

import java.util.Arrays;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        Integer[] strings = Arrays.stream(numbers.split(" ")).map(n -> Integer.parseInt(n)).max(Integer::compare)
                .stream().toArray(Integer[]::new);
        Integer[] strings2 = Arrays.stream(numbers.split(" ")).map(n -> Integer.parseInt(n)).min(Integer::compare)
                .stream().toArray(Integer[]::new);
        return strings[0] + " " + strings2[0];
    }

}
