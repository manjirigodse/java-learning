package complexnumber;

public class Calculation {

    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(1,2);
        ComplexNumber n2 = new ComplexNumber(5,6);
//        ComplexNumber addition = ComplexNumber.add(n1, n2);
        ComplexNumber addition = n1.add(n2);
        ComplexNumber substraction = n1.sub(n2);
        ComplexNumber multiplication = n1.mult(n2);
        ComplexNumber.display(addition, "Addition is: " );
        ComplexNumber.display(substraction, "Substraction is: " );
        ComplexNumber.display(multiplication, "Multiplication is: " );

        System.out.println("n1 iota: " + ComplexNumber.iota);
    }


}
