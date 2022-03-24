

public class nested_try {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            try{
                a[5]=34/0;
            }
            catch(ArithmeticException e){
                System.out.println("ArithmeticException occured");
            }
            try{
                System.out.println(a[90]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.err.println("ArrayIndexOutOfBoundsException occured"); 
            }


        }

        catch(Exception e){
            System.out.println("parental Exception occured");
        }

    }
}
