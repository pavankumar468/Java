public class minimum_scalar_product_of_2_arrays {
    public static void main(String[] args) {
    
        int a[] = {10,30,20,40};
        int b[] = {2,4,5,1};
        int i,j,temp;

        //descending Bubblesort
        for( i=0;i<4-1;i++)
        {
            for(j=0;j<4-i-1;j++ )
            {
                if(a[j] < a[j+1] ){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        //Ascending selectionsort
        for(i=0 ;i<4-1 ;i++)
        {
            for(j=i+1;j<4;j++)
            {
                if(b[j] < b[i])
                {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        int product = 0;
        for(i=0;i<4;i++){
            product += a[i]*b[i];
        }



            System.out.println("minimum_scalar_product_of_2_arrays ="+product);
        

    }


}
