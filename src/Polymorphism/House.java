package Polymorphism;

public class House {

    String color = "white";

    int furnish(){
        System.out.println("House is furnished");
        return 0;
    }

    int furnish(int a, float b){
        System.out.println("House is furnished with " + a + " rupees");
        return a;
    }


}
