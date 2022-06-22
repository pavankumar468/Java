/*Method overridding: If a child class providies implementation of method,that is already providied in parent class is called 
 *   method overriding. used for run time polymorphism.
 * ->Rules of method overriding : method in child &parent must have same name& same parameters, they must be IS-A relationship.
 * -> we cannot override static method because static methods are there in class area and instance methods are there in heap area.
 * -> we cannot override main method.
  */
  class Bank{
       int getRateOfInterest(){return 2;}
  }
  class ICICI extends Bank{
    static int getRateOfInterest(){return 8;}
  }
  class SBI extends Bank{
    static int getRateOfInterest(){return 6;}
  }
  class Kukatpally extends SBI{
    static int getRateOfInterest(){return 12;}
  }

public class MethodOverriding {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("RateOfInterest = "+bank.getRateOfInterest());
        ICICI icici = new ICICI();
        System.out.println("RateOfInterest = "+icici.getRateOfInterest());
        
        System.out.println("RateOfInterest = "+SBI.getRateOfInterest());
        System.out.println("RateOfInterest = "+Kukatpally.getRateOfInterest());
    }
    
}
