
public class RemoveDuplicatesAnArray {

	public static void main(String[] args) {
		int arr[]= {1,2, 3, 6,8,9,3,9};
		int len=arr.length;
		
		for(int i=0; i<len; i++) {
			
		
			for(int j=i+1; j<len; j++) { 
				if(arr[i] > arr[j]) {
					
				int temp=0;
				temp=arr[i];
				arr[i]= arr[j];
				arr[j]=arr[i];
				}}
						
				System.out.println(arr[i]);
		}}
	}		

	

