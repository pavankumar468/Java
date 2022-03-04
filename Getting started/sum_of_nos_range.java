
import java.util.Scanner;
public class sum_of_nos_range {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter start no :");
        int start = sc.nextInt();
        System.out.println("Enter end no :");
        int end = sc.nextInt();
        int  sum =0;
        while(start <= end)
        {
            sum = sum+start;
            start++;
        }
        System.out.println("sum = "+sum);

    }
}
