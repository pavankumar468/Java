import java.util.Scanner;

public class primeornot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n =  sc.nextInt();
        int i=1,c=0;


        while(i<=n){
            if(n%i == 0 && n%n == 0){
               c++;
            }
            i++;
        }
        String result =  (c == 2)?" is prime no" : " is not prime no";
        System.out.println(start + result);
    }
}