package fundamentals;

import java.util.ArrayList;
import java.util.List;


//Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
//
//Return your answer as a number.
public class MixedSum {
    public int sum(List<Object> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
}
