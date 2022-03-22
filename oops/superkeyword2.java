fffclass Animal{
    String color ="white";
}

class Dog extends Animal{
    String color ="black";
    void color(){
        System.out.println(color);
        System.out.println(super.color);
    }
}


public class superkeyword2 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.color();
    }
}
