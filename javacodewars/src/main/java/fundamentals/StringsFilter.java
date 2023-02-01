package fundamentals;

import java.util.List;
import java.util.stream.Collectors;

public class StringsFilter {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(Integer.class::isInstance).collect(Collectors.toList());
    }
}
