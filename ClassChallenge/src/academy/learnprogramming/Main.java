package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.setBalance(100);
        System.out.println("Opening balance is " + bank.getBalance());
        bank.withdrawFunds(200);
        bank.depositFunds(50);
        bank.withdrawFunds(100);

        VipCustomer firstVipCustomer = new VipCustomer();
        System.out.println(firstVipCustomer.getName());
        System.out.println(firstVipCustomer.getCreditLimit());
        System.out.println(firstVipCustomer.getEmailAddress());

        VipCustomer secondVipCustomer = new VipCustomer("Gaurav",100.0);
        System.out.println(secondVipCustomer.getName());
        System.out.println(secondVipCustomer.getCreditLimit());
        System.out.println(secondVipCustomer.getEmailAddress());

        VipCustomer thirdVipCustomer = new VipCustomer("Rekha",101.0, "rekha@gmail.com");
        System.out.println(thirdVipCustomer.getName());
        System.out.println(thirdVipCustomer.getCreditLimit());
        System.out.println(thirdVipCustomer.getEmailAddress());

    }
}
