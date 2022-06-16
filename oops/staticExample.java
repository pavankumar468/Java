/*static =  used for memory management, static is applied in variable, method , block,inner class
 * static variable: An instance variable which is constant for all objects created should be static variable. static variable
 * memory created only once in class area.
 * static method : A static method belong to a class rather than object of class,a static method can be called with 
 */
class Student{
    int roll;
    String name;
    static String college = "smec";
    int age; //non static variable
     static int count;

    public Student( int roll, String name){
        this.roll = roll;
        this.name = name;
        count++;
        System.out.println(count);
    }

    //static method
    static void change(){
        college= "BVRIT";
    }

    public void display(){
        System.out.println(roll+"  "+name+"  "+college+"  "+age+"   "+count);
     }


}
public class staticExample {
    public static void main(String[] args) {
        Student s1 = new Student(111,"pavan");
        Student s2 = new Student(222,"kumar");
        Student s3 = new Student(333,"raj");
        s1.display();
        s2.display();
        Student.college = "mrtn"; // change static variable
        s1.display();
        s2.display();
        Student.change();  // change static variable using static method
        s1.display();
        s2.display();
    }
    
}
