package academy.learnprogramming;

import java.util.function.DoubleToIntFunction;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

       String durationString = getDurationString(61,-1);
       System.out.println(durationString);

        durationString = getDurationString(7200);
        System.out.println(durationString);
    }

    public static String getDurationString(int minutes, int seconds){

        if (minutes >= 0  && seconds >= 0 && seconds <= 59) {

            int totalSeconds = (minutes * 60) + seconds;
            int hour = totalSeconds / 3600;
            int remainingSeconds = totalSeconds % 3600;
            int remainingMinutes = remainingSeconds / 60;
            remainingSeconds %= 60;

            return "The duration string is = " + hour + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        }

        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int seconds) {

        if (seconds >= 0) {

            int minute = seconds / 60;
            int remainingSeconds = seconds % 60;
            System.out.println("Duration : " + minute + "m " + remainingSeconds + "s");
            return getDurationString(minute, remainingSeconds);
        }

        return INVALID_VALUE_MESSAGE;
    }

}
