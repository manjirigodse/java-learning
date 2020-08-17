package abstraction;

public class User {

    public static void main(String[] args) {

        Bike bike1 = new Honda();
        bike1.numberOfWheels = 2;

        Honda honda1 = new Honda();
        honda1.speedLimit = 50;

    }
}
