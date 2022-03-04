import java.util.Scanner;
public class armstrong_in_range{
    public static int armstrong(int n,int c){
        if(n == 0){
            return 0;
        }
        return (int)Math.pow((n%10),c)+armstrong(n/10, c);
    }

    public static int length(int temp){
        int c = 0 ;
        while(temp != 0){
            temp = temp/10;
             c++;
         }
         return c;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter start no:");
      int start = sc.nextInt();
        System.out.println("Enter end no:");
        int end = sc.nextInt();
        System.out.print("Armstrong no = ");
        while(start <= end)
        {
           int c = length(start);
            int arm = armstrong(start, c);
            if(start == arm){
                System.out.print(start+" ");
            }
         start++;
        }

    }
}