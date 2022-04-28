import java.util.Scanner;
public class multidimensionalstringarray{

public static void main(String args[]){
    String name[][] = new String[2][2];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter strings:");
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            name[i][j]=sc.nextLine();
        }
    }

System.out.println("strings are:");
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
           System.out.print("  name["+i+"]["+j+"] = "+name[i][j] );
        }
        System.out.println(" ");
    }
}

}