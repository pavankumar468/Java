package mypack;
import mypack.shape;

public class square extends shape{
    public int area(int side,int side1){
        return side*side1;
    }

    public int perimeter (int side,int side1){
        return 4*side;
    }

}