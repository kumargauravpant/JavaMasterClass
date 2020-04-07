package academy.learnprogramming;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactionList;
    private double amount;

    public Customer(String name, double amount) {
        this.name = name;
        this.amount = amount;
        this.transactionList = new ArrayList<Double>();
        addTransaction(this.amount);
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }

    public void addTransaction(double amount) {
        this.transactionList.add(amount);
    }

    // This method should move to the calling class
    public void listTransactions() {
        System.out.println("Currently there are " + transactionList.size() + " transactions for customer " + this.name);
        for (int i=0; i<transactionList.size(); i++) {
            System.out.println("\t" + (int) (i+1) + ". " + transactionList.get(i));
        }
    }
}
