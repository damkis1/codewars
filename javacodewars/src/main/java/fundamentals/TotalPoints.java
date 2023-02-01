package fundamentals;

public class TotalPoints {

    // public static int points(String[] games) {
    //       return Arrays.stream(games)
    //                     .mapToInt(score -> score.charAt(0) - score.charAt(2))
    //                     .map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)
    //                     .sum();
    //    }
    public static int points(String[] games) {
        int sum = 0;
        for (int i = 0; i < games.length; i++) {
            sum += strings(games[i]);
        }
        return sum;
    }
    private static int strings(String s){
        int sum = 0;
        String[] split = s.split(":");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        if (a > b){
            sum += 3;
        }else if (a == b){
            sum += 1;
        }
        return sum;
    }
}
