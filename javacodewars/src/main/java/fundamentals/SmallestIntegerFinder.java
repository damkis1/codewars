package fundamentals;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int smallest = args[0];
        for (int i = 0; i < args.length; i++) {
            if (smallest > args[i]) {
                smallest = args[i];
            }else args[i] = smallest;
        }
        return smallest;
    }

}
