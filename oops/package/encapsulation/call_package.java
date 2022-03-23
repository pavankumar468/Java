import encap_package.*;

public class call_package{
     public static void main(String[] args) {
         student obj = new student();
         obj.setter("pavan");
         System.out.println(obj.getter() + " kumar");
     }
}