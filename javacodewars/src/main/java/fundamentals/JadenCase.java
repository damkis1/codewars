package fundamentals;

import java.util.Arrays;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null)
            return null;
        else if (phrase.isEmpty())
            return null;
        else return Arrays.stream(phrase.split(" "))
                    .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                    .reduce("",(result, next) -> result + next + " ").strip();
    }

}
