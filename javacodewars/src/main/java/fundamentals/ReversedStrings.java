package fundamentals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReversedStrings {
    public static String solution(String str) {
        String stream = Stream.of(str)
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining());
        return stream;

        //return new StringBuffer(str).reverse().toString();
    }

}

