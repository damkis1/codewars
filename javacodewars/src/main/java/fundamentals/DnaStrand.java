package fundamentals;

public class DnaStrand {
    // A -> T
    public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A') {
                chars[i] = 'T';
            } else if (chars[i] == 'T') {
                chars[i] = 'A';
            } else if (chars[i] == 'C') {
                chars[i] = 'G';
            } else if (chars[i] == 'G') {
                chars[i] = 'C';
            }
        }

        return charToString(chars);
    }

    private static String charToString(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
