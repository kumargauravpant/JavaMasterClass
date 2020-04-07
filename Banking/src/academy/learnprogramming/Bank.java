package academy.learnprogramming;

import javax.sound.midi.Soundbank;
import javax.swing.text.DefaultEditorKit;
import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branchList;

    public Bank() {
        this.branchList = new ArrayList<Branch>();
    }

    public Branch getBranch(String branchName) {
        int branchIndex = findBranch(branchName);
        if (branchIndex >= 0) {
            return branchList.get(branchIndex);
        } else {
            return null;
        }
    }

    private int findBranch(String branchName) {
        for (int i=0; i<branchList.size(); i++) {
            if(branchList.get(i).getName().equalsIgnoreCase(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isBranch(String branchName) {
        if (findBranch(branchName) < 0) {
            return false;
        }
        return true;
    }

    public void addBranch(String branchName) {
        if (findBranch(branchName) < 0) {
            Branch branch = new Branch(branchName);
            branchList.add(branch);
            System.out.println("A new Branch " + branchName + " is added.");
        } else {
            System.out.println("Branch " + branchName + " already exists.");
        }
    }

    public void showCustomers(String branchName) {
        int branchIndex = findBranch(branchName);
        if (branchIndex < 0) {
            System.out.println("Branch " + branchName + " does not exist.");
        } else {
            Branch branch = branchList.get(branchIndex);
            System.out.println("Customer in the branch " + branchName + " are:");
            branch.listCustomers();
        }
    }

    public void addTransaction(String branchName, String customerName, double amount) {
        int branchIndex = findBranch(branchName);

        Branch branch = branchList.get(branchIndex);
        if(branch.isCustomer(customerName)) {
            Customer customer = new Customer(customerName,amount);
            branch.addTransaction(customer);
            System.out.println("Transaction " + amount + " is added for customer " + customerName);
        }
    }

    public void showTransactions(String branchName, String customerName) {
        int branchIndex = findBranch(branchName);
        if (branchIndex < 0) {
            System.out.println("Branch " + branchName + " does not exist.");
        } else {
            Branch branch = branchList.get(branchIndex);
            ArrayList<Customer> customerList = branch.getCustomerList();
            for (int i=0; i<customerList.size();i++) {
                if (customerList.get(i).getName().equalsIgnoreCase(customerName))
                    branch.listTransactions(branch.getCustomerList().get(i));
            }
        }
    }

   public void listBranch() {
       System.out.println("Currently there are " + branchList.size() + " branches");
       for (int i=0; i<this.branchList.size(); i++) {
           Branch branch = this.branchList.get(i);
           System.out.println("\t" + (int) (i+1) + ". " +branch.getName());
       }
   }
}
