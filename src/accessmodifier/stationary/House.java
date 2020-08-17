package accessmodifier.stationary;


import accessmodifier.movable.Car;

public class House {

    int area;
    String address;
    Car car;
    static{
        System.out.println(3);
    }

    public House() {
        car = new Car(10);
    }

    public void parkCar() {
        System.out.println("Parking car: " + car.modelName);
    }
}
