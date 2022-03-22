
class animal{
    void eat()
        {
            System.out.println("eating");
        }
}

class Dog extends animal{
    void bark()
    {
        System.out.println("barking");
    }
}

class baby_dog extends Dog{
     void weep()
     {
         System.out.println("weeping");
     }
}

class cat extends animal{
    void meow(){
        System.out.println("meowing");
    }
}




public class inheritance {
 public static void main(String[] args) {
  animal obj = new animal();

 obj.eat();
 baby_dog obj2 =  new baby_dog();
 obj2.weep();
 obj2.eat();
 obj2.bark();

 cat obj3 = new cat();
 obj3.meow();



 }    
}
