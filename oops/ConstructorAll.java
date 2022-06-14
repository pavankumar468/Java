/*Constructor : is method used to initialize objects with default values ,when objects are created it has garbage values.
 * Rules of creating constructor
 * ->A constructor name same as class name.
 * ->constructor doesnt have qualifiers(static,final,abstract,synchronized),constructors can have access modifiers(public,private,protected,default)
 * ->A constructor doesnt have return type.
 * 
 * Types of constructors : default/ non parameterized,parameterized, copy constuctor
 * -> Default/non parameterized constructor: when no constructor is written in class, compiler calls default constructor.add default values to object.
 * -> parameterized constructor: used to add intial values to object.
 * -> copy constructor : not there in java , by copy values from one object to another object using constructor or by assining value to members og objects.
 * 
 * => constructor overloading: a class can have one or more constructors with different parameters performs different tasks.
 */

public class ConstructorAll {
    int id;
    int age;
    public ConstructorAll(){  //Constructor overloading
        System.out.println("default or non parameterised constructor");
        System.out.println(age +"  "+id);
    }
    public ConstructorAll(int id, int age){ //constructor overloading
        this.age=age;
        this.id=id;
        System.out.println(" parameterised constructor");
        System.out.println(age +"  "+id);
    }
    public void display(){
        System.out.println(age+" "+id);
    }
    public static void main(String[] args) {
        new ConstructorAll();  //default or non parameterised constructor
        new ConstructorAll(123,9); //parameterised constructor
        ConstructorAll s1 = new ConstructorAll(123,12),s2= new ConstructorAll(232,67);
        System.out.println("s1 values:");
        s1.display();
        System.out.println("s2 values:");
        s2.display();

        ConstructorAll s3 = new ConstructorAll(456,23); //copy constructor
        //ConstructorAll s4= new ConstructorAll(s3); By constructor
        ConstructorAll s4= new ConstructorAll(); // By assiging values from one object to another
        s4.id = s3.id;
        s4.age = s3.age;
        
        System.out.println("copy constructor s4 values:");
        s4.display();

    }
}
