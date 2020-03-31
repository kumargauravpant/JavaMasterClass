package academy.learnprogramming;

public class Bank {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double amount) {
        balance += amount;
        System.out.println(amount + "is deposited. New balance is " + balance);
    }

    public void withdrawFunds(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds!");
        } else {
            balance -= amount;
            System.out.println(amount + "is withdraw. New balance is " + balance);
        }
    }
}
