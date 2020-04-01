package academy.learnprogramming;

public class Car extends Vehicle {

    private int gear;
    private boolean isAutomatic;
    private int door;
    private String type;

    public Car( String name, int gear, boolean isAutomatic, int door, String type) {
        super(1, 1, name);
        this.gear = 1;
        this.isAutomatic = isAutomatic;
        this.door = door;
        this.type = type;
    }

    public int getGear() {
        return gear;
    }

    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Car.gear(). Gear is changed to " + this.gear);
    }
}
