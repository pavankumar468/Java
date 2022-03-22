/*method overloading : A class having multiple methods with same name and different parameters and different implementation.
2types:
1)by changing no of arguments.
2)By changing datatype.
*/

//By using method overloading main() can be called n no of times, But JVM calls only string[]args main method.
class Adder{
int add(int a,int b){return a+b;}
double add(int a,int b){return a+b;}  //XXX method overloading is not possible by changing return type due to ambiguity.
int add(int a,int b,int c){return a+b+c;}
double add(double a,double b){return a+b;}
}

public class method_overloading {
    public static void main(String[] args) {
        Adder obj = new Adder();
        System.out.println("add = "+obj.add(4, 5));
        System.out.println("add = "+obj.add(7, 8, 9));
        System.out.println("add = "+obj.add(4.5, 5.6));
    }
}
