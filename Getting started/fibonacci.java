import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no:");
        int n =  sc.nextInt();
        int a = 0, b = 1,temp,i=2;
        System.out.print(a+" "+b+" ");
        while( i++<= n){
            a = a+b;
            temp = b;
            b = a;
            a = temp;
            System.out.print(a+" ");
        }
    }
}
