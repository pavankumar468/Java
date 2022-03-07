import java.util.*;

public class longest_polindrome{
    static void hashmap_frequency(int a[], int n){
        Arrays.sort(a);

        for(int i=0;i<n;i++){
            System.out.println(a[i] + " ");
        }

    }
    public static void main(String[] args) {
        int a[] = new int[]{121, 2322, 54545, 999990};
        int n = a.length();
        longest_polindrome(a,n);

    }  
}