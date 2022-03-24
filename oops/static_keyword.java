/**Static : keyword is used for memory management , it is used on variables, methods, blocks. static variable get memory allocation 
 * at once in class area when class loading. static method  is created without need of creating instance of class
 */
class student{
    private String name;
    private int no; // instance variable
    public static String college = "SMEC"; // static variable memory allocate once ,value store out of instance
    static int count =0;
    static void change(){  //static method dont need of creating instance of class,
    college = "BITS"; //static method is used to access static variables and can change its values
    } 

    student(String na,int n){
            no=n;
            name=na;
    }

    void display(){
        System.out.println(no+" "+name+" "+college);
    }

}

class static_keyword{
    public static void main(String[] args) {
        student obj1 =  new student("pavan",12);
        student obj2 = new student("kumar",45);
        obj1.display();
        obj2.display();
      
    }

}