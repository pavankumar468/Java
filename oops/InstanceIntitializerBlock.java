/*Instance intializer block: is used to intialize instance variable. normally we can intialize variable directly.
 * -> But Instance intializer block is used to perform operations to intialize a variable.
 * -> Operations are performed in 3 places: constructor, method, Block.
 * => Rules of instance instialize block
 * -> Instance intializer block is created when instance of class is created.
 * -> Instance intializer block is invoked when parent class constructor is invoked..
 * -> Instance intializer block follows sequence.
 */
 class A{
  A(int a){
    System.out.println("this is class A = "+a);
  }
}

class B extends A{
    int b;
     B(int a,int b){
        super( a);
        this.b=b;
    }
    
    {  System.out.println("this is Instance intilizer block");}
    void display(){
        System.out.println("b= "+b);
    }
}
public class InstanceIntitializerBlock {
    public static void main(String[] args) {
        B obj = new B(34,23);
        obj.display();
        
    }
    
}
