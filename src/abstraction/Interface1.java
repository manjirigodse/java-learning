package abstraction;

public interface Interface1 {

    /*
    - Interfaces gives 100% abstraction, interfaces cannot be instantiated
    - multiple inheritance can be achieved.
    - used to achieve loose coupling
    - methods are public abstract & fields are public static final by default
    - since Java 8, we can have default and static methods in an interface.
    - Since Java 9, we can have private methods in an interface.
    */

    void changeGear();
    void followTrafficRules();
    int chassiNumber = 1234;

    default void deccelerate(){
        System.out.println("Slow Down");
    }

    static void accelerate(){
        System.out.println("Speed Up");
    }

}
