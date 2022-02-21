class sum_of_elements_of_array {
	static int getsum(int arr[],int i,int n){
		if (i == n-1)
		{
			return arr[i];
		} 
		else
		{
			return arr[i] + getsum(arr,i+1, n);

		}
	}

	public static void main(String args[]) {
		int arr[] = new int[] {12, 13, 1, 10, 34, 10};
		int n = arr.length;
		 System.out.println( getsum(arr,0 ,n));
		
	}
}
