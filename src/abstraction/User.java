package abstraction;

public class User {

    public static void main(String[] args) {

        Bike bike1 = new Honda();
        bike1.numberOfWheels = 2;

        Honda honda1 = new Honda();
        honda1.speedLimit = 50;

        bike1.servicing();
        honda1.servicing();

        System.out.println(Honda.chassiNumber);
    }
}
