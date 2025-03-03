
public class LinearSearchorSequntialsearch {

	public static int linearSearch(int arr[], int target) {
	
	
	for (int i=0; i<arr.length; i++) {
		if(arr[i] == target) {
			return i;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		int n[]= {3, 8, 9, 15,5};
		int target =5;
		 int r= linearSearch(n,target);
		 
		 if(r != -1) {
			 System.out.println("Elements found at index:"+ r );
		 }
		 else {
			 System.out.println("Element not found");
		 }

	}

}
