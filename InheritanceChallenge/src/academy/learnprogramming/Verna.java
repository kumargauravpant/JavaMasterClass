package academy.learnprogramming;

public class Verna extends Car{

    private int freeServiceCount;

    public Verna(int freeServiceCount) {
        super("Verna", 6, true, 5, "FWD");
        this.freeServiceCount = freeServiceCount;
    }

    public void accelerate(int speed, int direction){
        move(speed);
        int newSpeed = getVelocity();
        if( newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);
        } else if (newSpeed > 20 && newSpeed <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }
        steer(direction);
    }

    @Override
    public void stop() {
        System.out.println("Verna.stop() is called.");
        super.stop();
        changeGear(1);
    }
}
