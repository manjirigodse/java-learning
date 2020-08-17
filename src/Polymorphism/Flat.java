package Polymorphism;

public class Flat extends House {

    final int squareFeet;
    String color = "pink";

    Flat(int squareFeet){
        this.squareFeet = squareFeet;
    }

    @Override
    protected int furnish(int a, float b){
        System.out.println("Flat is furnished with " + a*b + " rupees");
        return a * (int)b;
    }

    static Flat downcasting(House h){
        if( h instanceof Flat ){
            Flat f = (Flat) h;       // downcasting
            return f;
//           f.furnish(4, 5);
//           System.out.println(f.color);
        }
        else{
            System.out.println("na");
            return null;
        }

    }

}
