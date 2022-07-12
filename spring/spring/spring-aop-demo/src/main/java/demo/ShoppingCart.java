package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
        /*Aspect(removing crosscutting consern*/
        //Logging
        //Authentication & authorization
        //sanitize the data

        //Bussiness logic
        System.out.println("checkout method from shoppingcart called");
    }

    public int quantity(){
        return 2;
    }
}
