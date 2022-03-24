//Exception propagation : exception rises in one defination (m2),and this m2 fun is called in m1 function ,here m1 is also responsible for exception.
//Exception propagation is passing exception handling responsiblities to other functions.
//Rethrowing exception: converting one type of exception into another type o exception.
public class Exception_propagation_and_rethrowing_exception {
    void m(){
       int data = 50/0;
    }
    void n(){
        m();
    }

    void p(){
        try{
            n();
        }
        catch(ArithmeticException ude){
            System.out.println("ArithmeticException is occured");
            //throw new NullPointerException(); //Rethrowing exception
        }
    }
    public static void main(String[] args) {
        Exception_propagation_and_rethrowing_exception obj =new Exception_propagation_and_rethrowing_exception();
        obj.p();
        System.out.println("normal flow...");  
    }
}
