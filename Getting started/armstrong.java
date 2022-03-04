import java.util.Scanner;

public class armstrong {
   public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
       System.out.println("Enter a no:");
       int n =  sc.nextInt();
       int c =0 ,sum=0,r,temp = n,arm =n;
       while(temp!=0){
        temp=temp/10;
           c++;
       }
//System.out.println(c);
       while(n!=0){
           r=n%10;
           sum = sum + (int)Math.pow(r,c);
           n=n/10;
       }
       System.out.println("armstrong = "+sum);
       if(sum == arm){
           System.out.println("armstrong");
       }else{
        System.out.println("not armstrong");
       }
   } 
}
