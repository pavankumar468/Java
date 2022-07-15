/*Strings: generally a string is sequence of characters. in java a string is ana object that represents sequence of characters
 * -> we can create string objects using 1) string literal ,2)new keyword;
 * 1) String literal: when string object is create using string literal its value is checked in "string constant pool" if its value tis already there,then it is refered to variable or new instance is create with value and refered to varible.
 * 2) new keyword: when string object is created with new, then it will search in "string constant pool" if its value there variable is refered with value, or else new instance is created in heap area and refered to variable.
 * -> tostring(): normally an object return hashcode value, tostring tells jvm compiler to override method to return desired output string.
 */
import java.lang.*;
class Employee{
    private String name;
    private int age;
    Employee(String name, int age){
        this.age=age;
        this.name=name;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        //return super.toString();  //returns hashcode
        return "name = "+name+"age = "+age;
    }
}
public class Strings {
   
    public static void main(String[] args) {
        String s1 = "sachin";
        String s2 = "SACHIN";
        String s3 = "rachn";
        String s5 = "sachin";
        String s4 = new String("sachin");

        /* String comparsion done using 1)Authentication equals() 2)reference matching == 3)sorting compareTo() */

        System.out.println("String comparision");
        System.out.println("string comparision using ==  used to compare references not values");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s5);
        System.out.println(s1 == s4); // string constant pool object matching with heap object

        System.out.println( "string comparison using equal() used to compare values not references");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));  //equals() accepts objects from string constant pool & hep as same.
        System.out.println(s1.equals(s5));

        System.out.println("string comparison using compareTo() used to lexicographical values and return integer value");
        System.out.println(s1.compareTo(s5));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));

        System.out.println("String concatenation");
        System.out.println("1) concatenation using + operator");
        String s = "pavan"+" kumar";
        System.out.println(s);
        System.out.println("2) concat() used to concatenate one string at end of another string");
         s = s1.concat(s3);
        System.out.println(s);
        System.out.println("3) concatenation using string builder is most used way . append() of string builder take arguments like objects,int,float,char,charsequence,stringbuilder,boolean,double and perform concatenation. string builder created bojects are mutable i.e we can change object values ");
        StringBuilder p = new StringBuilder("google ");
        StringBuilder p1 = new StringBuilder(" london");
        StringBuilder p2 = p.append(p1);
        System.out.println(p2.toString());
        System.out.println("4) format() and join() used to concatenate multiple strings ");
        String q = String.format("%s %s %s",s1,s2,s4);
        String w = String.join(" ",s3,p,p1);
        System.out.println(q);
        System.out.println(w);
        /*System.out.println("StringJoiner class is advance of join ,its constructor can accept argements,prefex,suffix");
        StringJoiner sj = new StringJoiner(",");
        sj.add(p1);
        sj.add(p);
        System.out.println(sj.toString());*/

        System.out.println("\nsubstring() is used to extract a string from another string");
        System.out.println(s2.substring(2)); // substring(intial value);
        System.out.println(p2.substring(3,6));

        System.out.println("tostring()");
        Employee emp = new Employee("pavan", 23);
        System.out.println(emp);// prints Employee@63961c42 hashcode without tostring

    }
    
}
