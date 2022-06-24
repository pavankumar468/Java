/*=>Object class : Is parent class of all classes in java by default. it is top most of all classes.
 * -> object class is useful if we dont know object type.hten parent reference variable is referred to child class.
 * => Object Cloning: Object cloning is used to create exact copy of an object.it uses clone() method of java.lang.Cloneable interface
 * -> clone() method saves extra processing time which is taken when we instantiating object using new keyword.
 */
class Student implements Cloneable {
    int id;
    String name;
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class ObjectClass_ObjectCloning {
    public static void main(String[] args) {
      try {
        Student student = new Student(101, "amit");
        System.out.println(student.id+"  "+student.name);
        Student student2 = (Student)student.clone();
        System.out.println(student2.id+"  "+student2.name);
      } catch (CloneNotSupportedException e) {
          //TODO: handle exception
          System.out.println(e);
      }
    }
}
