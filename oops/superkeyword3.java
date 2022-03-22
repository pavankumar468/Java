class Animal{
void show(){
    System.out.println("this is animal");
}
}
 class dog extends Animal{
    void show(){
        System.out.println("this is dog");
    }
    void display(){
        System.out.println("this is dispaly");
    }
    void fun(){
        super.show();
        show();
        display();
    }
    
 }

public class superkeyword3 {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.fun();
    }
}
