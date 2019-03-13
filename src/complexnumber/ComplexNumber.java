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

    public ComplexNumber add(ComplexNumber n1){
       return new ComplexNumber(this.real + n1.real, this.imag + n1.imag);
    }

    public ComplexNumber sub(ComplexNumber n1){
        return new ComplexNumber(this.real - n1.real, this.imag - n1.imag);
    }

    public ComplexNumber mult(ComplexNumber n1) {
        return new ComplexNumber(n1.real * this.real - n1.imag * this.imag, n1.real * this.imag + n1.imag * this.real);
    }

    public static void display(ComplexNumber number, String message) {
        System.out.println(message + number.real + " + " + number.imag + "i");
    }
}

