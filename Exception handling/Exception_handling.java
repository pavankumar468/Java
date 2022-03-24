/*Exception handling : while program is executing for some i/ps o/ps might get error. so those i/p values that might get error is 
checked in try block , those exceptions are sent to catch using throw block, those exceptions are handled in catch block.
-> Exception are used to write good quality of code , checking errors at compile time , not at run time.
*/
// Exception handling used to handle run time errors.
/* -> try: contains exception code that might throw exception
   > catch: used to handle exception.

*/

import java.util.Scanner;
class Exception_handling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nemo = sc.nextInt();
        int demo =  sc.nextInt();
        int result =0;
        try{
            //if(demo == 0)
            //throw demo;

             result = nemo/demo;
        }

        catch(ArithmeticException e )
        {
            System.out.println(e);
        }
        System.out.println("result = "+ result);
    }
}