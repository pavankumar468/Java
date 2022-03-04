import java.util.Scanner;

public class reverse_of_no {
    static int reverse(int n,int rev){
        if(n == 0){
            return rev;
        }
        rev = rev *10 + (n%10);
        return reverse(n/10,rev);
    
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a no:");
       int n = sc.nextInt();
      
      
      
     System.out.println("reverse of digits "+reverse(n,0));
       int poly = reverse(n,0);
        String result = (n  == poly)?"\nPolindrome" :"\nnot Polindrome";
        System.out.print(n +result);
   } 
}
