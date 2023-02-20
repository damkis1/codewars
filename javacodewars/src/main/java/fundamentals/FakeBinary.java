package fundamentals;



//Fake Binary
public class FakeBinary {
    public static String fakeBin(String numberString) {
        int[] ints = toInt(numberString);
        int[] fakes = toFakeBinary(ints);


        if (numberString != null) {
            return arrayToString(fakes);
        }else throw new IllegalStateException();
    }

    private static int[] toInt (String numberString){
        String[] split = numberString.split("");
        int [] changedToInt = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            changedToInt[i] = Integer.parseInt(split[i]);
        }
        return changedToInt;
    }

    private static int[] toFakeBinary(int [] aa){
        for (int i = 0; i < aa.length; i++) {
            if (aa[i] < 5){
                aa[i] = 0;
            }else if (aa[i] >= 5){
                aa[i] = 1;
            }
        }
        return aa;
    }

    private static String arrayToString(int [] aa){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < aa.length; i++) {
            stringBuilder.append(aa[i]);
        }
        return stringBuilder.toString();
    }
}