package fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ANeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        int number = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] instanceof String){
                if (Objects.equals(haystack[i], "needle")){
                    number = i;
                }
            }
        }
        return "found the needle at position " + String.valueOf(number);
    }

    public static String findNeedleStreamShorterMethod(Object[] haystack) {
        return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
    }
}
