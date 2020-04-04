package academy.learnprogramming;

class Car {
    private boolean engine;
    private int cylinder;
    private int wheels;
    private String name;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return this.name;
    }

    public int getCylinder() {
        return this.cylinder;
    }

    public void startEngine() {
        System.out.println("Car engine is started.");
    }

    public void accelerate() {
        System.out.println("Car is accelerated.");
    }

    public void brake() {
        System.out.println("Car is stopped.");
    }
}

class Celerio extends Car{
    public Celerio() {
        super(1, "Celerio");
    }

    @Override
    public void startEngine() {
        System.out.println("Celerio engine is started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Celerio is accelerated.");
    }
}

class Verna extends Car {
    public Verna() {
        super(2, "Verna");
    }

    @Override
    public void startEngine() {
        System.out.println("Verna engine is started.");
    }

    @Override
    public void brake() {
        System.out.println("Verna is stopped.");
    }
}

class Ciaz extends Car {
    public Ciaz() {
        super(2, "Ciaz");
    }

    @Override
    public void accelerate() {
        System.out.println("Ciaz engine is accelerated.");
    }

    @Override
    public void brake() {
        System.out.println("Ciaz is stopped.");
    }
}

public class Main {

    public static void main(String[] args) {
	for (int i=0; i<11; i++){
        Car myCar = drive();
        System.out.println(myCar.getCylinder() + "," + myCar.getName());
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();
    }
    }

    public static Car drive(){

        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("randomNumber = " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Celerio();
            case 2:
                return new Verna();
            case 3:
                return new Ciaz();
        }
        return  null;
    }
}
