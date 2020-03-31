package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (count < 10){

            count++;
            System.out.println("Enter Number #" + count +":");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid Number Entered.");
                break;
            }
        }
        scanner.close();
        System.out.println("Sum of entered numbers is: " + sum);
    }
}
