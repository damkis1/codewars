package fundamentals;
//Create a function which answers the question "Are you playing banjo?".
//If your name starts with the letter "R" or lower case "r", you are playing banjo!
//
//The function takes a name as its only argument, and returns one of the following strings:
public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        if (name.startsWith("r") || name.startsWith("R")){
            return name + " plays banjo";
        }else return name + " does not play banjo";
    }

}
