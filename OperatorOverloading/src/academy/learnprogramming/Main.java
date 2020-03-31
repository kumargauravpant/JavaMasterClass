package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println("centimeters = " + calcFeetAndInchesToCentimeters(157));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if (feet >=0 && inches >=0 && inches <= 12){

            return ((feet * 12) + inches ) * 2.54;
        }
        return -1;
    }

    public  static double calcFeetAndInchesToCentimeters(double inches){

        if ( inches >= 0){

            int calculatedFeet = (int) inches / 12;
            double calculatedInches = inches % 12;
            System.out.println("Feet = " + calculatedFeet);
            System.out.println("Inches = " + calculatedInches);
            return (calcFeetAndInchesToCentimeters(calculatedFeet,calculatedInches));
        }
        return -1;
    }
}
