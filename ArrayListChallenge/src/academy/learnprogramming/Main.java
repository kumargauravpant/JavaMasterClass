package academy.learnprogramming;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {

        boolean quit = false;

        while(!quit) {
            printMessage();
            int selection = scanner.nextInt();
            scanner.nextLine();

            switch(selection) {
                case 0:
                    break;
                case 1:
                    listContacts();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong option selected.");
                    break;
            }
        }

        scanner.close();
    }

    public static void printMessage(){
        System.out.println("Select operation to perform:");
        System.out.println("\t 0. Print Message.");
        System.out.println("\t 1. Show Contacts.");
        System.out.println("\t 2. Add Contacts.");
        System.out.println("\t 3. Update Contacts.");
        System.out.println("\t 4. Delete Contacts.");
        System.out.println("\t 5. Quit.");
        System.out.print("Enter your choice:");
    }

    public static void listContacts(){
        mobilePhone.getContacts();
    }

    public static void addContacts(){
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Number: ");
        String number = scanner.nextLine();
        mobilePhone.addContacts(name, number);
    }

    public static void updateContact() {
        System.out.print("Enter existing contact name: ");
        String existingName = scanner.nextLine();
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new number: ");
        String newNNumber = scanner.nextLine();
        mobilePhone.modifyContact(existingName,newName,newNNumber);
    }

    public static void removeContact() {
        System.out.print("Enter contact name to remove: ");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }
}
