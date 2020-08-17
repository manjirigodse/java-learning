package accessmodifier;


import accessmodifier.movable.Bmw;
import accessmodifier.movable.Car;
import accessmodifier.movable.Truck;
import accessmodifier.stationary.House;

public class Main {
    public static void main(String[] args) {

//        System.out.println(Car.getCar(1233).);
        Bmw bmw = new Bmw();


        House house = new House();
        Truck truck = new Truck();


        Car.numberOfWheels = 4;
//        new Car(1234).run();
        house.parkCar();
//        bmw.cha
        bmw.setChassisNumber(1,2);
        bmw.getChessisNumber();
        System.out.println(Car.numberOfWheels);
    }
}
