import java.util.Scanner;

public class primenos_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start no:");
      int start = sc.nextInt();
        System.out.println("Enter end no:");
        int end = sc.nextInt();
        int i,c;
        while(start<=end && start != 0)
        {
            i=1;
            c=0;
            while(i<=start){
                if(start%i == 0 && start%start == 0){
                   c++;
                }
                i++;
            }

           if( c== 2){
               System.out.println(start+" is prime no");
           }
            start++;
        }


  

    }
}
