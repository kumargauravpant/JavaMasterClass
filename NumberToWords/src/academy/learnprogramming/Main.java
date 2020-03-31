package academy.learnprogramming;

public class Main {

    public static int getDigitCount(int number) {

        if (number < 0) return -1;

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int reverse(int number) {

        boolean isNegative = false;
        int reversedNumber = 0;

        if (number < 0) {
            isNegative = true;
            number = 0 - number;
        }
        while (number > 0) {

            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
        }

        if (isNegative)
            return 0 - reversedNumber;
        else
            return reversedNumber;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int digitCount = getDigitCount(number);
            int reversedNumber = reverse(number);
            while (reversedNumber > 0) {

                int digit = reversedNumber % 10;
                System.out.println(digitToWord(digit));
                reversedNumber /= 10;
            }
        }

    }

/*    public static String digitToWord(int digit) {

        String word = "";
        switch (digit) {
            case 0:
                word = "Zero";
                break;
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eignt";
                break;
            case 9:
                word = "Nine";
                break;
            default:
                word = "Invalid Value";
                break;
        }

        return word;
    }*/

    public static void main(String[] args) {

        numberToWords(-1259);
    }
}