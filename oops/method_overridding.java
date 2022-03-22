/*method overridding: is implementation of methods is different in parent & child class.
method overloading occurs at run time.
*/
class vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}
class bike extends vehicle{
    void run(){
        System.out.println("bike is running");
    }
}
//Example 2

public class method_overridding {
    public static void main(String[] args) {
        //bike obj=new bike();
        //obj.run();/
        

    }
}
