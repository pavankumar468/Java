/*  ->Typecasting is process of converting one datatype to another datatype.upcasting/downcasting comes under object typecasting.
 * -> upcasting : If reference variable of parent class is refered to child class.Upcasting is done to parent object to access variables and
 *  methods of child class.
 *          parent p = new child();
 * -> downcasting : If refernce variable of child class is refered to parent class.downcasting is done to child object to access variables and 
 * methods of parent class.
 *          parent p = new child();
 *          child c = (child)p;
*/
class Parent{
    void Printdata(){
        System.out.println(" this is parent class");
    }
}
class Child extends Parent{
    void Printdata(){
        System.out.println("this is child class");
    }
}
public class UpcastingDowncasting {
    public static void main(String[] args) {
        Parent parent = new Parent(); //instantiating parent object
        parent.Printdata(); 
        new Parent().Printdata();

        Parent parent2 =new Child(); // {Upcasting} parent object is refered with child object
        parent2.Printdata();

        Parent parent3 = new Child();
        Child child = (Child) parent3; //downcasting
        child.Printdata();

    }
}
