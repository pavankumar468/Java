// Multicatch block: a try block can have multiple catch blocks, but catch blocks are executed according to order of program exceptions;
//finally : finally block contains code that is executed even if exception occured or not;
// finally is used to put cleanup code(closing file,closing connections)
public class multi_catch_block_finally_keyword {
    public static void main(String[] args) {
        
        try{
            int a[] = new int[5];
            //a[5] = 10/0; //ArithmeticException
            System.out.println(a[10]);//ArrayIndexOutOfBoundsException

            //String s = null;
            //System.out.println(s.length());//parental Exception
        }

        catch(ArithmeticException e)
        {
           // a[5] = 10/2;  // handling exception
           // System.out.println(a[5]);
            System.out.println("ArithmeticException occured");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("ArrayIndexOutOfBoundsException occured"); // err prints o/p in red colour
        }

        catch(Exception e){
            System.out.println("parental Exception occured");
        }
        
        finally{
            System.out.println("hello");
            System.out.println("pavan");
        }


    }
    
}
