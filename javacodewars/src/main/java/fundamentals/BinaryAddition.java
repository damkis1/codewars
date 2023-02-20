package fundamentals;
//Implement a function that adds two numbers together and returns their sum in binary.
// The conversion can be done before, or after the addition.
//
//The binary number returned should be a string.
//
//Examples:(Input1, Input2 --> Output (explanation)))

public class BinaryAddition {
    public static String binaryAddition(int a, int b) {
        /*Integer.toBinaryString()*/
        int sum = a + b;
        int spam;
        StringBuilder binary = new StringBuilder();
        while (sum > 0) {
            spam = sum % 2;
            sum /= 2;
            binary.append(String.valueOf(spam));
        }
        return binary.reverse().toString();
    }

}
