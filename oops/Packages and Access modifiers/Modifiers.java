/* compiler = javac -d . Modifiers.java
 * run = java accessmodifiers.Modifiers
 * Access modifiers : ussed to set visibility of methods, class, interfaces, variables
 * Private : 1)If we make class constructor as private we cannot create instance of class,
 *           2)A class cannot be private or protected except nested class.
 * Default : default classes are used in same package
 * Protected : is accessible within package/outside of package but through inheritence only
 * protected is applied in method, constructor, datamembers but not on classses;
 * 
 */
package accessmodifiers;
import expack.*;

 class Privatee{  //default class 
    private int data = 40;
    private void method(){
        System.out.println("welcome access modifiers");
    }
     /*  Privatee(){
         private void method(){
            System.out.println("welcome access modifiers");
        }
    }*/

}


/*public class Modifiers  {
    public static void main(String[] args) {
        //Privatee p = new Privatee();
        //System.out.println(p.data);
       // p.method();
        Test1 d = new Test1();
        d.msg();

    }
    
}*/
public class Modifiers extends Test1{  // for protected
    public static void main(String[] args) {
        Modifiers m = new Modifiers();
        m.msg2();
    }
}
