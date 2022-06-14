/* Anonymousobject is a object not refered to any variable */
public class Anonymousobject {
    void fact(int a, int b){
        System.out.println("ans = "+a*b);
    }
    public static void main(String[] args) {
        new Anonymousobject();  // creating AnonymousObject which is to refered to any variable
        new Anonymousobject().fact(5,7);
    }
}
