/*wrapper class : is used to convert primitive datatype into objects using "Autoboxing" and objects into primitive datatype using "Unboxing".
*=> uses of wrapper classes:
*->used for call by reference: java doesn't support call by reference, but if pass object rather than primitive datatype .we can change 
* call method original values.
*->Serialization: we need to convert primitive datatype to object then to streams to perform serialization.
*->Synchronization : uses objects in multithreading.
*->Collection framework : deals with objects.
*-> There are 8 wrapper classes in java.lang package
*->     Primitive type            wrapper class
*========================================================
*->     boolean                   Boolean
*->     char                      Character
*->     byte                      Byte
*->     short                     Short
*->     int                       Integer
*->     long                      Long
*->     float                     Float
*->     double                    Double
 */

public class WrapperClasses {
    public static void main(String[] args) {
      byte b =10;
      short s = 30;
      int i = 12;
      long l = 40;
      float f = 50.6f;
      double d = 23.45d;
      char c = 'a';
      boolean b2 = true;

      //Autoboxing : converting primitive into objects
      Byte byteobj = b;
      Short shortobj = s;
      Integer intobj = i;
      Long longobj = l;
      Float floatobj = f;
      Double doubleobj = d;
      Character charobj = c;
      Boolean boolobj = b2;

      //Printing objects  
    System.out.println("---Printing object values---");  
    System.out.println("Byte object: "+byteobj);  
    System.out.println("Short object: "+shortobj);  
    System.out.println("Integer object: "+intobj);  
    System.out.println("Long object: "+longobj);  
    System.out.println("Float object: "+floatobj);  
    System.out.println("Double object: "+doubleobj);  
    System.out.println("Character object: "+charobj);  
    System.out.println("Boolean object: "+boolobj);  

    //unboxing : converting objects into primitive
    byte bytevalue = byteobj;
    short shortvalue = shortobj;
    int intvalue = intobj;
    long longvalue = longobj;
    float floatvalue =  floatobj;
    double doublevalue = doubleobj;
    char charvalue =  charobj;
    boolean boolvalue = boolobj;

    
    //Printing primitives  
    System.out.println("---Printing primitive values---");  
    System.out.println("byte value: "+bytevalue);  
    System.out.println("short value: "+shortvalue);  
    System.out.println("int value: "+intvalue);  
    System.out.println("long value: "+longvalue);  
    System.out.println("float value: "+floatvalue);  
    System.out.println("double value: "+doublevalue);  
    System.out.println("char value: "+charvalue);  
    System.out.println("boolean value: "+boolvalue);  
    }
    
}
