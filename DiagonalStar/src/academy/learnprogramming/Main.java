package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        printSquareStar(8);
    }

    public static void printSquareStar(int number) {

        if (number < 5) {

            System.out.println("Invalid Value");
        } else {

            for (int i = 1; i <= number; i++) {

                for (int j = 1; j <= number; j++) {

                    if (i == 1 || j == 1 || i == number || j == number || j == i || (i + j) - 1 == number) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
