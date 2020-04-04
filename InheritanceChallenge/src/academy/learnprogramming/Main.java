package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Verna verna = new Verna(3);

        verna.accelerate(20, 45);
        verna.accelerate(30,45);
        verna.stop();

        Vehicle vehicle = new Verna(3);
        vehicle.stop();

        System.out.println(verna.getGear());
        vehicle.stop();
    }
}
