package Inheritance;

//public class InheritanceTypes {

    /*
    IS-A relationship

    Inheritance = 1. Method Overriding (Runtime Polymorphism)
                  2. Code Reusability (Fields & Methods)

      syntax: Class ChildClass extends Class ParentClass{............}

      Types: Single, multilevel, Hierarchical

      multiple and hybrid inheritance is supported through interface only.

      Compile-time error when C extends A, C extends B

     */
//}

//Class Aggregation extends Class InheritanceTypes{

    /*
    When Class have entity reference
    HAS-A Relationship
         */

//}
class Operation{
    int square(int n){
        return n*n;
    }
}

class Circle{
   // Operation op;//aggregation
    double pi=3.14;

    double area(int radius){
        Operation op=new Operation();
        //int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).
        return pi*op.square(radius);
    }



    public static void main(String args[]){
        Circle c=new Circle();
        //double result=c.area(5);
        System.out.println(c.area(5));
    }
}