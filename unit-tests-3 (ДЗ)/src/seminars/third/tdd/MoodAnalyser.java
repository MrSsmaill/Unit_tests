package seminars.third.tdd;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("плохое")){
            return "BAD";
        } else if (message.contains("грустно")) {
            return "SAD";
        } else if (message.contains("радосное")) {
            return "HAPPY";
        } else if (message.contains("веселое")) {
            return "FUNNY";
        }
        return "NORMAL";
    }
}
