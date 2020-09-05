package abstraction;

public class Honda extends Bike{

    int speedLimit;

    @Override
    void speedup() {

    }

    static void servicing() {
        System.out.println("Honda Servicing");
    }

    void acclerate(){

    };

    @Override
    public void changeGear() {
        System.out.println("change honda gear");
    }

    @Override
    public void followTrafficRules() {
        System.out.println("Honda follows traffic rules");
    }
}
