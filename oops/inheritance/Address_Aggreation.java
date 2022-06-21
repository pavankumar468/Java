package inheritance;
public class Address_Aggreation {
    protected String city,state;
    protected int pin;

    public Address_Aggreation(String city, String state, int pin){
        this.city = city;
        this.pin = pin;
        this.state = state;
    }
    
}
