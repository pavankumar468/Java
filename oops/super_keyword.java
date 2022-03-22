/*super = super keyword infront any variable or method makes it refers to parent class.
super() function directly calls parent function constructor.
*/
class person{
    int n;
    String name;
    person(int n, String name){
        this.n=n;
        this.name=name;
    }
    

}

class Employee extends person{
    double salary;
    Employee(int n, String name,double salary){
        super(n,name);
        this.salary=salary;
    }
    void display(){
        System.out.println(n+" "+name+" "+salary);
    }
   
}


public class super_keyword {
    public static void main(String[] args) {
        Employee obj = new Employee(1,"pavan",500.45);
        obj.display();
        
    }
}
