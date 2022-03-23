interface printable{
    void printee();
}
interface display{
    void show();
}

class copy implements printable,display{
    public void printee(){
        System.out.println("hello");
    }

    public void show
}

public class interface_keyword {
  public static void main(String[] args) {
      printable obj = new copy();
      obj.printee();
  }
}

