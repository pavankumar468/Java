class A{
    int n;
    String name;
 A(){
    System.out.println("A is running");
 }
 //constructor overloading is same class name but different implementation
 A(int n, String name){
    this.n=n;
    this.name=name;
 }
 // copy constructor
 A(A obj){
     this.n=obj.n;
     this.name= obj.name;
 }
 void display(){
     System.out.println(n+2+" "+name);
 }

}

public class constructor {
    public static void main(String[] args) {
            A obj = new A();//non parameterised constructor
            A obj1 = new A(1,"pavan");
            A obj2 = new A(obj1);
            obj1.display();
        obj2.display();
            
    }
}
