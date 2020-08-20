package abstraction;

public abstract class Bike implements Interface1{

    /*
    Abstract class is declared with abstract keyword.
    Can have abstract methods (declared so), non-abstract methods, dataa members, constructor, main method.
    Cannot be instantiated.


     */

    int numberOfWheels;
    Bike() {
        numberOfWheels = 2;
        System.out.println("Bike is created");
    }

    abstract void speedup();

    static void servicing(){
        System.out.println("Bike sevicing" );
    }



}
