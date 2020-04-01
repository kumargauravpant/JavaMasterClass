package academy.learnprogramming;

public class Vehicle {

    private int body;
    private int size;
    private String name;
    private int velocity;
    private int direction;

    public Vehicle(int body, int size, String name) {
        this.body = body;
        this.size = size;
        this.name = name;
        this.velocity = 0;
        this.direction = 0;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getVelocity() {
        return velocity;
    }

    public void steer(int direction) {
        this.direction = direction;
        System.out.println("Vehicle.steer(). Vehicle is moving at " + this.direction + " degree");
    }

    public void move(int speed) {
        this.velocity += speed;
        System.out.println("Vehicle.move(). Vehicle is moving at speed " + this.velocity);
    }

    public  void stop() {
        this.velocity = 0;
        System.out.println("Vehicle.stop(). Vehicle stopped moving.");
    }

}
