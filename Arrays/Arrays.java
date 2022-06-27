/*Arrays : are used to store similar datatype elements in continous memory locations.
 * ->Array is object of dynamically generated class.it inherits object class, it implements serialization , cloneable interfaces.
 * -> we can store primitive values , objects in array
 * -> Anonymous array: dont need to declare array while we are passing into method.
 * ->JVM throws ArrayIndexOutOfBounds exception if sizeof array is equal or negative.
 * ->Array implements cloneable inteface that it array can deepcopy it into another array.
 */
public class Arrays {
    static int min(int c[]){
        int mini = c[0];
        for(int j=1;j<c.length;j++){
            if(c[j]>mini){
                mini = c[j];
            }
        }
        return mini;
    }

    static int[] sort(int a[]){
        return new int[]{23,34,56,12};
    }

    public static void main(String[] args) {
        //int a[]; //declaration
        //new int[5]; instantiation with size
        int a[] = new int[5]; //declaration, instantiation
        for(int i=0;i<a.length;i++){
            a[i] =i; // intialization
        }

        int b[] ={23,45,56};
        for(int j:b){  //for each loop
            System.out.print(j+" ");
        }
 
        for(int i:a){   //foreach syntax for(datatype variablename: arrayname ){}
            System.out.print(i+" ");
        }
        int c[] = new int[5];
        for(int i:c){
            c[i]=i;
        }
        System.out.println("\n min = "+min(c)); //passing array to method
        System.out.println(" min = "+ min(new int[]{34,23,45,12,24})); // Anonymous array: donot need to refer array to variable.

        int arr[]=sort(c);  //Returning array from method and storing it into variable
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        int arr1[][] ={{1,2,3},{4,5,6}};
        int arr2[][] = new int[3][];
        int count = 8;
        /* for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = count++;
            }
        }
        */
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
        }

        System.out.println("\nclone array: ");
        int clone[] = a.clone();
        for (int i : clone) {
            System.out.print(clone[i]+" ");
        }


    }
    
}
