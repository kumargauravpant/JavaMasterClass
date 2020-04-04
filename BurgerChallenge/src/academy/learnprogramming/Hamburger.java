package academy.learnprogramming;

public class Hamburger {

    private String bread;
    private double basePrice;
    private String meat;
    private int additionsAllowed;
    private int totalAdditions;
    private String name;
    private String additionals;
    private double totalPrice;

    public Hamburger(String bread, double basePrice, String meat) {
        this.bread = bread;
        this.basePrice = basePrice;
        this.meat = meat;
        this.additionsAllowed = 4;
        this.totalAdditions = 0;
        this.name = "Basic";
        this.additionals = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdditionals(String additions) {
        if(totalAdditions == additionsAllowed){
            System.out.println("Additions are not allowed any more.");;
        } else {
            if (totalAdditions > 0){
                this.additionals += " , ";
            }
            this.additionals += additions;
            this.totalAdditions++;
        }
    }

    public void setAdditionsAllowed(int additionsAllowed) {
        this.additionsAllowed = additionsAllowed;
    }

    private void setTotalAdditions(int totalAdditions) {
        this.totalAdditions = totalAdditions;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        return  totalPrice;
    }

    public void makeBurger() {
        double additionalPrice = 0d;
        for (int i=0; i<totalAdditions; i++) {
            additionalPrice += 2;
        }
        totalPrice = basePrice + additionalPrice;

        System.out.println("A " + name + " burger is ready");
        System.out.println("Bread: " + bread +"  meat: " + meat + " additionals: " + additionals);
    }

}
