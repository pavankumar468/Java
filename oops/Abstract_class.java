/*Abstraction : is nothing but hiding implementation and showing functionality to end user.
 *  Abstraction is done using Abstract class and interface.
 * Abstract class: provides (0- 100%)abstraction. method is declared in abstract class and gets implementation in its child class.
 * ->A abstract class cannot be instantiated only its child class gets instantiated.
 * -> it consists of abstract & non abstract methods, constructors, static methods, final methods(method body not changed in subclass)
 * -> the class must be abstract for abstract method.
 */

 abstract class Shape{
    /*Shape(){  //constructor
        System.out.println(" shape is created");
     }*/
     abstract void draw(); //abstract method

     void area(int a){   // normal method
         System.out.println("Area = "+ a*3);
     }
     /*static String size = "square";
     static void change(){  //static method
        size = "parallogram";
     }*/

 }

 class Rectangle extends Shape{
     void draw(){
         System.out.println("shape is rectangle");
     }
     
 }

 class Triangle  extends Shape{
     void draw(){
         System.out.println("shape is triangle");
     }
    
 }

public class Abstract_class {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.draw();
        Shape s2 = new Triangle();
        s2.draw();
      //  Shape.change();//static method
        
    }
    
}
