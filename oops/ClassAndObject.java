
/*Classes : logical entity that creates structure used by objects, no memory allocation
 * objects : are physical entity stores data, memory allocation
  */
 class Employee{
    public int id;
    private String name;
    public void func(int a, String b){
        id=a;
        name=b;
    }
    public void display(){
        System.out.println(id+"  "+name);
    }
}
 public class ClassAndObject{
  
    public static void main(String args[]) {
        //Employee s1 =  new Employee();  // allocated memory to s1 object by refernce
      //  Employee s2 =  new Employee(); // allocated memory to s2 object by refernce
        Employee s1 = new Employee(),s2 = new Employee(); // create multiple objects at a time
        // initialization through reference
        s1.id = 4; // initialization s1.id object 

        //initialization through method
        s1.func(9,"pavan kumar");
        s1.display();

    }
}
