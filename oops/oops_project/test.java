import mypack.*;
import mypack.*;

class test{
     public static void main(String[] args) {
        shape obj = new rectangle();
        
        System.out.println("area of rectangle ="+ obj.area(4,5));
        System.out.println("perimeter of rectangle ="+ obj.perimeter(4,5));

        shape obj2 = new square();
        System.out.println("area of square ="+ obj.area(4,4));
        System.out.println("perimeter of square ="+ obj.perimeter(5,5));
    } 
}