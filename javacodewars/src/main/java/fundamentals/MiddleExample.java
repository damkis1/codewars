package fundamentals;

public class MiddleExample {
    public static String getMiddle(String word) {

        String abc = "";
        int n = word.length() / 2 + word.length() % 2 - 1;
        if (word.length() % 2 == 0) {

            abc = word.substring(n, n + 2);

        } else if (word.length() % 2 != 0) {

            abc = word.substring(n, n + 1);
        }
        return abc;
    }


}
