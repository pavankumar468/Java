/*Encapsulation : is process of wrapping of code and data together as single unit.
 * -> we can create a fully Encapsulated class by making all data members of class private and use setters and getter to set and 
 * get data.
 * -> It provides control over data , if we want to set value >100  logic written in setter method.
 * setter =  writeonly, getter =  readonly
 */
package com.javapoint;
 class TestEncapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
    s1.setName("vijay");
    System.out.println(s1.getName());
    }
    
}
