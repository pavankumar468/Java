/*Polymorphism: is  process of method performed in diferent ways. polymorphism is of 2 types run time and compile time polymorphism.
 * Runtime polymorphism : is method overloading that is done at run time.
 * compile time polymorphism: is method overridding that is done at compile time.
 * Method overridding: If a child class providies implementation of method,that is already providied in parent class is called 
 *   method overriding. used for run time polymorphism.
 * ->Rules of method overriding : method in child &parent must have same name& same parameters, they must be IS-A relationship.
 * -> we cannot override static method because static methods are there in class area and instance methods are there in heap area.
 * -> we cannot override main method.
  */
  class Bank{
       int getRateOfInterest(){return 2;}
  }
  class ICICI extends Bank{
     int getRateOfInterest(){return 8;}
  }
  class SBI extends Bank{
     int getRateOfInterest(){return 6;}
  }
  class Kukatpally extends SBI{
     int getRateOfInterest(){return 12;}
  }

   class Animal{
      void eat(){System.out.println("eating..");}
  }
  class Dog extends Animal{
      void eat(){System.out.println("eating bread..");}
  }
  class Cat extends Animal{
      void eat(){System.out.println("eating rat..");}
  }

public class MethodOverriding {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("RateOfInterest = "+bank.getRateOfInterest());
        ICICI icici = new ICICI();
        System.out.println("RateOfInterest = "+icici.getRateOfInterest());
        
        SBI sbi = new SBI();
        System.out.println("RateOfInterest = "+sbi.getRateOfInterest());
        Kukatpally kukatpally = new Kukatpally();
        System.out.println("RateOfInterest = "+kukatpally.getRateOfInterest());

       Animal animal = new Animal();
        animal.eat();
        animal = new Dog();
        animal.eat();
        animal = new Cat();
        animal.eat();
    }
    
}
