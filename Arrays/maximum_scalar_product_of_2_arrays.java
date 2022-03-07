
import java.util.Arrays;
import java.util.Collections;

public class maximum_scalar_product_of_2_arrays {
    public static void main(String[] args) {
        int a[] = {1,2,6,3,7};
        int b[] = {10,7,45,3,7};
        int i,j,temp;
        //Acending bubble sort
        Arrays.sort(a);
        Arrays.sort(b);

       int product =0;
        for(i =0 ;i<5;i++)
        {
            product += a[i]*b[i];
        }
        System.out.println(" maximum_scalar_product_of_2_arrays = "+product);
    }
}
