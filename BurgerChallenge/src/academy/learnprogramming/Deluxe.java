package academy.learnprogramming;

public class Deluxe extends Hamburger {
    public Deluxe(String bread, double basePrice, String meat) {
        super(bread, basePrice, meat);
        setName(getClass().getSimpleName());
        setAdditionsAllowed(2);
        setAdditionals("Chips");
        setAdditionals("Coke");
    }
}

