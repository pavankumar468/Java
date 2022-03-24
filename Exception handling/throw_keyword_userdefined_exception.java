
 class UserDefinedException extends Exception
 {
    public UserDefinedException(String str)
    {
        super(str);// calling constructor of parent Exception class
    }
}

public class throw_keyword_userdefined_exception 
{
    public static void main(String[] args) 
    {
        try
        {
            throw new UserDefinedException("This is userdefined_exception");
        }
        catch(UserDefinedException ude){
            System.out.println("Caught the exception");
            System.out.println(ude.getMessage());
        }
        
    }
}
