public class final_keyword_variable {
    final int a =90;

    int run(){
        a=23;
        return a;
    }

    public static void main(String[] args) {
        
        final_keyword_variable obj=  new final_keyword_variable();

        System.out.println(obj.a);
      
        System.out.println( obj.run());


    }
}
