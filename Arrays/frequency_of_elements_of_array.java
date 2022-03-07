import java.util.*;
public class frequency_of_elements_of_array{
	static void frequency(int a[],int n){
		int visit[] = new int[n];
		int i,j,c;
		
		for(i=0 ; i<n; i++){
			if(visit[i] ==  0){
				c=0;
				for(j=0 ;j<n;j++){
					if(a[i] == a[j]){
						c++;
						visit[j] = 1;
					}
				}
				System.out.println(a[i]+" occurs "+c+"times ");
			}
		}
		
		
	
	}
	
	public static void main(String[] args){
		int a[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		System.out.print("Enter array elements : ");
		for(int i=0;i<n;i++)
		{
			a[i] =  sc.nextInt();
		}
		
		frequency(a,a.length);
		
	} 
}
