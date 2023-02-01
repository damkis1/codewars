package fundamentals;
//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
//
//Examples
//"This is an example!" ==> "sihT si na !elpmaxe"
//"double  spaces"      ==> "elbuod  secaps"


import java.util.Arrays;
import java.util.stream.Collectors;


public class ReverseWords {
    public static String reverseWords(final String original) {
        return original.trim().isEmpty() ? original : Arrays.stream(original.split(" "))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining(" "));
    }

}
