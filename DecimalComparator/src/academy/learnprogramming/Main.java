package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.1754, 3.1756));


    }

    public static boolean areEqualByThreeDecimalPlaces(double firstDoubleValue, double secondDoubleValue){

        int firstValue = (int) (firstDoubleValue * 1000);
        int secondValue = (int) (secondDoubleValue * 1000);

        return firstValue == secondValue;
    }
}
