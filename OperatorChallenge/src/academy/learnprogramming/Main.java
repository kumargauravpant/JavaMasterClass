package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double myFirstDoubleVariable = 20.00d;
        double mySecondDoubleVariable = 80.00d;
        double myTotalDouble = (myFirstDoubleVariable + mySecondDoubleVariable) * 100.00d;

        double reminder = myTotalDouble % 40.00d;
        boolean isZero = reminder == 0 ? true : false;

        System.out.println(isZero);

        if (!isZero) {
            System.out.println("Got some reminder!");
        }

        displayHighScorePosition("Gaurav", 1);

        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(900));
        System.out.println(calculateHighScorePosition(400));
        System.out.println(calculateHighScorePosition(50));

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        }
        return 4;
    }

    double d = 2.123d;
    double d1 = 2.122d;


}
