/*Inheritance in java used to acheive Abstraction(100%), Multiple Inheritance and loose coupling in java 
 * ->Interface represents IS-A relationship, Interface can consists of default, static, private, abstract methods.
 * ->Interface have only method declaration but its implementation is stored in its child class
 * -> In Interface by default compiler converts variable into public static final , and methods are public abstract.
 * -> A class->extents->class, Interface->extends->Interface, class->implements->Interface
 * -> Multiple Inheritance is class->implement->multiple interfaces and Interface->extends->multiple Interfaces
 * -> Multiple inheritance is not supported in classes because of ambiguity, but it is possible in Interfaces coz no ambiguity.
 */

interface Bank{
    int var = 23; // // compiler converts variable into "public static final int var = 23;"
    float rateOfInterest(); // compiler converts method into "public abstract float rateOfInterest();"
    default void msg() { System.out.println("This is default method");} // we can have default method in Interface but we need to make default keyword in front of method
    static int cube(int c){ // we can have static methods in Interfaces
        return c*c*c;
    }
}

interface Finance{
    double Interest();
   
}


class SBI implements Bank{
    public float rateOfInterest(){
        return 9.12f;
    }
}

class ANB implements Bank{
    public float rateOfInterest(){
        return 12.34f;
    }
}
//Multiple Inheritance as class implements multiple interfaces
class Total implements Bank,Finance{
    public float rateOfInterest() {
        return 23.23f; 
     
    }
    public double Interest() {
       return 12.23233;
    }
}

// multiple inheritance as Interface extends multiple interfaces
interface Person_debt extends Bank,Finance{
    int debt();
}

class Loan implements Person_debt{
     public float rateOfInterest() {
         return 56.232f;
     }
     public double Interest() {
         return 34.2434;
     }
     public int debt() {
         return 34456;
     }
}

public class Interface_class {
    public static void main(String[] args) {
        Bank obj = new SBI();
       System.out.println( "SBI rateOfInterest = "+obj.rateOfInterest() );
       System.out.println( "var= "+obj.var );
       obj.msg();
       System.out.println("static cube ="+Bank.cube(3));
       Bank obj2 = new ANB();
       System.out.println("ANB rateOfInterest = "+obj2.rateOfInterest());
        
       Total_A obj3 = new Total_A();
       
       System.out.println(obj3.rateOfInterest());
       System.out.println(obj3.Interest());
 

       Loan obj4 = new Loan();
       System.out.println("Interest = "+obj4.Interest());
       System.out.println("rateOfInterest ="+obj4.rateOfInterest());
       System.out.println("debt = "+obj4.debt());
       
    }
}
