/*Aggregation: is one object reference is there in another object .Follows HAS_A relationship. It is tight coupling.i
 * Inheritance is used when objects have longer relationship b/w themselves otherwise Aggreation used b/w objects
 */
package inheritance;
 class Employee{
    String name;
    int age;
    Address_Aggreation address_Aggreation; // Agggreations
    public Employee(String name,int age, Address_Aggreation address_Aggreation){
        this.name =name;
        this.address_Aggreation = address_Aggreation;
        this.age=age;
    }

    public void display(){
        System.out.println(name+" "+age+" "+address_Aggreation.city+" "+" "+address_Aggreation.state+" "+address_Aggreation.pin);
    }

}
public class Aggregation_class {
    public static void main(String[] args) {
        Address_Aggreation address_Aggreation1 = new Address_Aggreation("HYD","TELA",50018);
        Address_Aggreation address_Aggreation2 = new Address_Aggreation("skl", "anp", 50021);
        Employee employee1 = new Employee("pavan", 23, address_Aggreation1);
        Employee employee2 = new Employee("liki", 20, address_Aggreation2);
        employee1.display();
        employee2.display();

    }
}
