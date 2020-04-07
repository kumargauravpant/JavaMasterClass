package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();
    public static void main(String[] args) {
        boolean quit = false;
        System.out.println("Welcome to MyBank.");
        printMessage();
        while(!quit) {
            System.out.println("Enter your choice (Press 0 to show options): ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    printMessage();
                    break;
                case 1:
                    bank.listBranch();
                    break;
                case 2:
                    listCustomers();
                    break;
                case 3:
                    addBranch();
                    break;
                case 4:
                    addCustomer();
                    break;
                case 5:
                    addTransaction();
                    break;
                case 6:
                    listTransactions();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong Option selected.");
            }
        }

        scanner.close();
    }

    private static void printMessage() {
        System.out.println("\t1. List Branches\n " +
                        "\t2. List Customers\n " +
                        "\t3. Add Branches\n " +
                        "\t4. Add Customers\n " +
                        "\t5. Add Transactions\n" +
                        "\t6. List Transactions\n" +
                        "\t7. Quit\n");
    }

    public static void listCustomers(){
        System.out.print("Enter Branch Name: ");
        String branchName = scanner.nextLine();
        if (bank.isBranch(branchName)) {
            bank.showCustomers(branchName);
        } else {
            System.out.println("Branch " + branchName + " does not exist.");
        }
    }

    public static void addBranch() {
        System.out.print("Enter Branch Name to add: ");
        String branchName = scanner.nextLine();
        if (bank.isBranch(branchName)) {
            System.out.println("Branch " + branchName + " already exists.");;
        } else {
            bank.addBranch(branchName);
        }
    }

    public static void addCustomer() {
        System.out.print("For which branch do you want to add customer: ");
        String branchName = scanner.nextLine();
        if (bank.isBranch(branchName)) {
            Branch branch = bank.getBranch(branchName);
            System.out.print("Enter Customer Name to add: ");
            String customerName = scanner.nextLine();

            if (!branch.isCustomer(customerName)) {
                System.out.print("Enter opening amount: ");
                double openingAmount = scanner.nextDouble();
                scanner.nextLine();
                branch.addCustomer(customerName, openingAmount);
                System.out.println("Customer " + customerName + " is added to branch " + branchName);
            } else {
                System.out.println("Customer " + customerName + " already exists.");
            }
        } else {
            System.out.println("Branch " + branchName + " does not exist.");
        }
    }

    public static void addTransaction() {
        System.out.print("Enter the name of the branch: ");
        String branchName = scanner.nextLine();
        if (bank.isBranch(branchName)) {
            Branch branch = bank.getBranch(branchName);
            System.out.print("Enter the name of the customer: ");
            String customerName = scanner.nextLine();

            if (branch.isCustomer(customerName)) {
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                bank.addTransaction(branchName,customerName,amount);
                System.out.println("Transaction added from customer " + customerName + " ino branch " + branchName);
            } else {
                System.out.println("Customer " + customerName + " does not found in branch " + branchName);
            }
        } else {
            System.out.println("Branch " + branchName + " does not exist.");
        }
    }

    public static void listTransactions() {
        System.out.print("Enter the name of the branch: ");
        String branchName = scanner.nextLine();
        if (bank.isBranch(branchName)) {
            Branch branch = bank.getBranch(branchName);
            System.out.print("Enter the name of the customer: ");
            String customerName = scanner.nextLine();

            if (branch.isCustomer(customerName)) {
                bank.showTransactions(branchName,customerName);
            } else {
                System.out.println("Customer " + customerName + " does not found in branch " + branchName);
            }
        } else {
            System.out.println("Branch " + branchName + " does not exist.");
        }
    }
}
