package Polymorphism;

public class Main {

    public static void main(String[] args) {

        House house = new House();
        house.furnish(10, 20);

        Flat flat = new Flat(1000);
        System.out.println("Flat area is " + flat.squareFeet);

        Flat flat1 = new Flat(2000);
        System.out.println("Flat area is " + flat1.squareFeet);

        System.out.println("Flat area is " + flat.squareFeet);

        House house1 = new Flat(5000);  // upcasting
        house1.furnish(50, 100);
        System.out.println(house1.color);

        Flat f2 = (Flat) house1; // downcasted
        f2.furnish(6,7);
        System.out.println(f2.color);

        Flat.downcasting(house1).furnish(4,6);
        System.out.println(Flat.downcasting(house1).color);  // downcasting method called

        Flat f1 = null;
        System.out.println(f1 instanceof Flat);

    }
}
