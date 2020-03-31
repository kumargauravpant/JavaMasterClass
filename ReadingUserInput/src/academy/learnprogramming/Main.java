package academy.learnprogramming;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Last Name:");
        String lastName = scanner.nextLine();
        System.out.println("Year of Birth:");
        boolean hasNextInt = scanner.hasNextInt();

        if (!hasNextInt) {
            scanner.close();
            System.exit(1);
        }

        int yearOfBith = scanner.nextInt();

        scanner.nextLine(); // to handle new line issue after Number
        int age = 2020 - yearOfBith;

        System.out.println("Hi '" + firstName + " " + lastName + "' you are '" + age + "' years old.");
        scanner.close();
    }
}
