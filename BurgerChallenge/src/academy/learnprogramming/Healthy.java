package academy.learnprogramming;

public class Healthy extends Hamburger{

    public Healthy(double basePrice, String meat) {
        super("Brown Rye Bread", basePrice, meat);
        setAdditionsAllowed(6);
        setName("Healthy");
    }



}
