/* Association is relation b/w 2 classes.
1) Aggregation( weak relation): child can exists without parent.
2)composition(strong relation): child cannot exists without parent.*/
//Aggreation
class Bank{
     private String name;
     Bank(String name){  //constructor
         this.name = name;
     }

     public String getBankname(){ //method
        return this.name;
     }

}

class Employee{
    private String name;
    Employee(String name){
        this.name =  name;
    }
    public String getEmployeename(){
        return this.name;
    }
}

//Example2
class operation{
    double square(double n){
        return n*n;
    }
}

class circle{
    double a,pi=3.14;

    operation op =  new operation(); // create instance 
    double area(double radius){
        this.a = op.square(radius);
        return this.a;
    }
}
public class association_aggreation {
    public static void main(String[] args) {
         Bank obj = new Bank("ICICI");
         Employee obj2= new Employee("pavan");
        System.out.println(obj2.getEmployeename()+" is employee of"+obj.getBankname());
        
//Example2
        circle obj3= new circle();
        System.out.println("area of circle = "+obj3.area(5.6));

    }
    
}
