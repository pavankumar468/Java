import java.util.Scanner;
public class Evenorodd {
  public static void main(String[] args) {
      System.out.println("Enter no:");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     
      if(n%2 == 0){
        System.out.print("Even");
      }else{
          System.out.println("odd");
      }



  }  
}