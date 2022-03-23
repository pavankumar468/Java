package mypack;
import mypack.shape;

public class rectangle extends shape{
    public  int area(int length, int breadth){
        return length*breadth;
    }

    public int perimeter(int length, int breadth){
        return 2*(length+breadth);
    }
}