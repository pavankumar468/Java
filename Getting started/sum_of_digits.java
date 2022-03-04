import java.util.Scanner;

public class sum_of_digits {
    static int getsum(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + getsum(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int n = sc.nextInt();
        
        System.out.print("sum of digits "+getsum(n));
    }
}
