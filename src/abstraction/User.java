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

        // Anonymous inner class is created to provide implementation of abstract methods
        // in interface. This is not instance of interface
        Interface1 interface1 = new Interface1() {
            @Override
            public void changeGear() {
                System.out.println("Don't change gear");
            }

            @Override
            public void followTrafficRules() {
                System.out.println("traffic rules are not followed");
            }
        };
        interface1.changeGear();
        bike1.changeGear();
        honda1.changeGear();
        bike1.deccelerate();
        Interface1.accelerate();
        bike1.accelerate();
        honda1.deccelerate();

    }
}
