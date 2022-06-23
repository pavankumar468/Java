/*super = super keyword is a reference variable which is used to refer immediate parent class.
 * -> when ever you create instance of child class ,instance of parent class ia automatically generated.
 * =>>usages of super keyword:
 * -> super keyword variable used to refer immediate parent class instance variable if both parent &child class fields have same name.
 * -> super keyword method in child class used to invoke parent class method if both parent& child have same name.
 * -> super() used to invoke immediate parent class constructor.
 * 
 */
class Animal{
    String color = "blue";
    void func(){
        System.out.println("eating...");
    }
    Animal(){
        System.out.println("are in zooo");
    }
}
class Wild extends Animal{
    String color = "black";
     void display(){
        System.out.println("child = "+color);
        System.out.println("parent ="+super.color);
    }
    void func(){
        System.out.println(" sleeping..");
    }
    Wild(){
        //super(); //calling parent constructor automatically by compiler
        super.func(); //calling parent method
        System.out.println("are in forest");
    }
}

public class Super_class {
   public static void main(String[] args) {
    Wild wild = new Wild();
    wild.display();
    wild.func();

   }
}
