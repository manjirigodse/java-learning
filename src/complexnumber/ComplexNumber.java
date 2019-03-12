package complexnumber;

import java.util.concurrent.Callable;

public class ComplexNumber {
    public int real;
    public int imag;

    //parameterized constructor
    public ComplexNumber(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    //default constructor
    ComplexNumber(){

    }

    public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2){
       ComplexNumber addition = new ComplexNumber();
       addition.real = n1.real + n2.real;
       addition.imag = n1.imag + n2.imag;
       return addition;
    }

    public static ComplexNumber sub(ComplexNumber n1, ComplexNumber n2){
        ComplexNumber substraction = new ComplexNumber();
        substraction.real = n1.real - n2.real;
        substraction.imag = n1.imag - n2.imag;
        return substraction;
    }

    public static void display(ComplexNumber number, String message) {
        System.out.println( message + number.real + " + " + number.imag + "i");
    }
}

