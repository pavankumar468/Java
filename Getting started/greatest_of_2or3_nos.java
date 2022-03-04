import java.util.Scanner;

public class greatest_of_2or3_nos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //greatest of 2 nos
        String result = (a>b)? " a is big":"b is big";
        System.out.println(result);
 
        //greatest of 3 nos
        String result1 = (a>b)?(a>c)?"a is big" : "c is big" : (b >c)? "b is big" :"c is big";
        System.out.println(result1);
 
    }
}