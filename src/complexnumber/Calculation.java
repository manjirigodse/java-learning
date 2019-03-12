package complexnumber;

public class Calculation {

    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(1,0);
        ComplexNumber n2 = new ComplexNumber(5,6);
        ComplexNumber addition = ComplexNumber.add(n1, n2);
        ComplexNumber substraction = ComplexNumber.sub(n1, n2);
        ComplexNumber.display(addition, "Addition is: " );
        ComplexNumber.display(substraction, "Substraction is: " );
    }


}
