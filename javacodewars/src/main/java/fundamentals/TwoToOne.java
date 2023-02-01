package fundamentals;

import java.util.Arrays;

//Take 2 strings s1 and s2 including only letters from a to z.
// Return a new sorted string, the longest possible,
// containing distinct letters - each taken only once - coming from s1 or s2.
public class TwoToOne {
    public static String longest (String s1, String s2) {
        String s1s2 = s1 + s2;
        return Arrays.stream(s1s2.split(""))
                .distinct()
                .sorted()
                .reduce("", (result, next) -> result + next + "");
    }


    public static void main(String[] args) {
        String a = "xyaabbbccccdefww";
        String b = "xxxxyyyyabklmopq";
        System.out.println(longest(a, b));
    }
}
