package accessmodifier.movable;

public class Car {
    int engineCapacity;
    public String modelName;
    private String engineType;
    protected int chassiNumber;
    public static int numberOfWheels = 4;
    public synchronized void run(){
        System.out.println("Car runs");
    }

    public Car() {

    }
    public Car(int chassiNumber) {
        this.chassiNumber = chassiNumber;
    }

}