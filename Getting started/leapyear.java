
import java.util.Scanner;
public class leapyear {
  public static void main(String[] args) {
      Scanner sc =  new Scanner(System.in );
      System.out.print("Enter year : ");
      int year = sc.nextInt();

      String result = ((year%400 == 0)|| (year%4 == 0 && year%100 !=0))?"Leap year":"not Leap year";
        System.out.println(result);
  }  
}
