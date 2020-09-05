package abstraction;

public abstract class Bike extends Aaa implements Interface1 {

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

    void accelerate(){

    }

    @Override
    public void changeGear() {
        System.out.println("change bike gear");
    }

    @Override
    void method1() {
        super.method1();
    }
}
