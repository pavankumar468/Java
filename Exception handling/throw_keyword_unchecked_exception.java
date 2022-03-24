//throws keyword is used to indentify the calling function might throw exception
class Throw{
    public void validate(int age) throws ArithmeticException
    {
        if(age<18){
            throw new ArithmeticException("age must be greater than 18");
        }else{
            System.out.println("valid to vote");
        }
    }

}
public class throw_keyword_unchecked_exception {
    public static void main(String[] args) {
        int a =6;
        Throw obj =  new Throw();
        obj.validate(a);
      /* try{
        obj.validate(a);
       }
        catch(ArithmeticException e){
            System.out.println(e);
        }*/

    }
}
