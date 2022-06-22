/*Method Overloading: If a class is having methods with same name  but perform different implementation
-> method overloading increases readability of program.
 * There are 2 ways of method overloading in java
 * 1)By changing no of parameters
 * 2)By changing datatypes 
 * -> method overloading is not possible by changing method return type.
 * -> main() method can be overloaded any noo of times, but JVM takes main() which have string arguments.
 * ->type promotion : https://static.javatpoint.com/images/java-type-promotion.png
 * ->  type promotion is one datatype promoted to another implicitlyi.e int->float/long/double abd char can be promoted to int/long/double/float
 */
class Operation{
    static int add(int a, int b){return a+b;}
    static int add(int a,int b, int c){return a+b+c;} // method with different parameters
    static float add(float a,float b) {return a+b;} // method with different datatype
    static long add(int a, long c){ return a*c;}
}

public class MethodOverloading {
    public static void main(String[] args) {
        Operation op = new Operation();
        System.out.println(Operation.add(23.23f, 4.6f));
        System.out.println(Operation.add(4, 6, 8));
        System.out.println(Operation.add(5, 9));
        //op.add(23,23413L);
        System.out.println(Operation.add(23,23413L));
    }
    public static void main() {
        System.out.println("main without string arguments");
    }
    
}
