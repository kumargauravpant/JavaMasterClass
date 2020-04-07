package academy.learnprogramming;

import java.util.ArrayList;
import java.util.zip.CheckedOutputStream;

public class Branch {

    private String name;
    private ArrayList<Customer> customerList;

    public Branch(String name) {
        this.name = name;
        this.customerList = new ArrayList<Customer>();
    }


    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    private int findCustomer(String customerName) {
        for (int i=0; i<customerList.size(); i++) {
            if(customerList.get(i).getName().equalsIgnoreCase(customerName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isCustomer(String customerName) {
        if (findCustomer(customerName) < 0) {
            return false;
        }
        return true;
    }

    public boolean addCustomer(String customerName, double openingAmount) {
        if (findCustomer(customerName) < 0) {
            Customer customer = new Customer(customerName,openingAmount);
            customerList.add(customer);
            return true;
        } else {
            return false;
        }
    }

    public boolean addTransaction(Customer customer) {
        String customerName = customer.getName();
        double amount = customer.getAmount();
        int customerIndex = findCustomer(customerName);
        if (customerIndex < 0) {
            return false;
        } else {
            Customer myCustomer = this.customerList.get(customerIndex);
            customer.addTransaction(amount);
            return true;
        }
    }

    public void listCustomers() {
        System.out.println("Currently there are " + customerList.size() + " customers in branch " + this.name);
        for (int i=0; i<this.customerList.size(); i++) {
            Customer customer = this.customerList.get(i);
            System.out.println("\t" + (int) (i+1) + ". " +customer.getName());
        }
    }

    public void listTransactions(Customer customer) {
        String customerName = customer.getName();
        if (findCustomer(customerName) < 0) {
            System.out.println("Customer does not found.");
            return;
        } else {
            customer.listTransactions();
        }
    }

}
