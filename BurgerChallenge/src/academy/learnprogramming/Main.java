package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Hamburger basicHamburger = new Hamburger("Garlic", 20,"Sweet Chili");

        basicHamburger.setAdditionsAllowed(4);
        basicHamburger.setAdditionals("Onion");
        basicHamburger.setAdditionals("Tomato");
        basicHamburger.setAdditionals("Corn");
        basicHamburger.setAdditionals("Lettuce");

        basicHamburger.makeBurger();
        System.out.println("total price: " + basicHamburger.getTotalPrice());

        Healthy healthyBurger = new Healthy(30,"Grilled");

        healthyBurger.setAdditionals("Onion");
        healthyBurger.setAdditionals("Tomato");
        healthyBurger.setAdditionals("Corn");
        healthyBurger.setAdditionals("Lettuce");
        healthyBurger.setAdditionals("Celery");
        healthyBurger.setAdditionals("Cucumber");

        healthyBurger.makeBurger();
        System.out.println(healthyBurger.getTotalPrice());

        Deluxe deluxeBurger = new Deluxe("Garlic",35,"Grilled");

        deluxeBurger.setAdditionals("Onion");

        deluxeBurger.makeBurger();
        System.out.println(deluxeBurger.getTotalPrice());
    }
}
